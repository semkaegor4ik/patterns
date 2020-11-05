package com.university.patterns.abstractfactory;


import com.university.patterns.abstractfactory.factories.BlackChessFactory;
import com.university.patterns.abstractfactory.factories.WhiteChessFactory;
import com.university.patterns.abstractfactory.interfaces.IChessFactory;

import java.util.Scanner;

public class AbstractFactoryExample {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        IChessFactory chessFactory = createFigureFactory();
        System.out.println("What kind of figure do ypu wanna create?\n" +
                "1:BISHOP\n" +
                "2:KNIGHT\n" +
                "3:PAWN\n" +
                "4:ROOK");
        switch (scanner.nextInt()){
            case 1:{
               chessFactory.createBishop().show();
               break;
            }
            case 2:{
                chessFactory.createKnight().show();
                break;
            }
            case 3:{
                chessFactory.createPawn().show();
                break;
            }
            case 4:{
                chessFactory.createRock().show();
                break;
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

    private IChessFactory createFigureFactory(){
        System.out.println("What the color of figure do you wanna create?\n" +
                "1:WHITE\n" +
                "2:BLACK\n");
        switch (scanner.nextInt()){
            case 1:{
                return new WhiteChessFactory();
            }
            case 2:{
                return new BlackChessFactory();
            }
            default:{
                throw new IllegalArgumentException();
            }
        }


    }

    public static void main(String[] args) {
        new AbstractFactoryExample().start();
    }

}