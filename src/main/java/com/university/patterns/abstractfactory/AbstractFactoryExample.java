package com.university.patterns.abstractfactory;


import com.university.patterns.abstractfactory.factories.BishopFactory;
import com.university.patterns.abstractfactory.factories.KnightFactory;
import com.university.patterns.abstractfactory.factories.PawnFactory;
import com.university.patterns.abstractfactory.factories.RookFactory;
import com.university.patterns.abstractfactory.interfaces.IChessFactory;

import java.util.Scanner;

public class AbstractFactoryExample {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        IChessFactory chessFactory = createFigureFactory();
        System.out.println("What the color of figure do you wanna create?\n" +
                "1:WHITE\n" +
                "2:BLACK\n");
        switch (scanner.nextInt()){
            case 1:{
                chessFactory.createWhiteFigure().show();
                break;
            }
            case 2:{
                chessFactory.createBlackFigure().show();
                break;
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

    private IChessFactory createFigureFactory(){
        System.out.println("What kind of figure do ypu wanna create?\n" +
                "1:BISHOP\n" +
                "2:KNIGHT\n" +
                "3:PAWN\n" +
                "4:ROOK");
        switch (scanner.nextInt()){
            case 1:{
                return new BishopFactory();
            }
            case 2:{
                return new KnightFactory();
            }
            case 3:{
                return new PawnFactory();
            }
            case 4:{
                return new RookFactory();
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

}