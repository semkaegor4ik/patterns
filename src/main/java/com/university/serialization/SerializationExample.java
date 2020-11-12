package com.university.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SerializationExample {
    public static void main(String[] args) {
        Salon salon = new Salon(Stream.of(new Car(200,"volvo")
        ,new RussianCar(80,"жигуль")
        ,new SportCar(675, "McClaren")).collect(Collectors.toList()));
        salonDatSerialize("salon.dat",salon);
        salonJSONSerialize("salon.txt", salon);
        salonXMLSerialize("salon.xml", salon);
    }

    public static void salonDatSerialize(String fileName, Salon salon){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)))
        {
            oos.writeObject(salon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salonJSONSerialize(String fileName, Salon salon){
        try(FileWriter oos = new FileWriter(fileName))
        {
            StringWriter writer = new StringWriter();
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(writer,salon);
            oos.write(writer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void salonXMLSerialize(String fileName, Salon salon){
        XmlMapper mapper = new XmlMapper();
        try {
            mapper.writeValue(new File(fileName), salon);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
