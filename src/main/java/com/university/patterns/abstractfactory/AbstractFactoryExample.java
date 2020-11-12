package com.university.patterns.abstractfactory;


import com.university.patterns.abstractfactory.interfaces.IChessFactory;
import com.university.patterns.abstractfactory.interfaces.IFigure;
import com.university.patterns.abstractfactory.models.ChessColor;
import com.university.patterns.abstractfactory.models.Figure;
import com.university.patterns.abstractfactory.factories.ChessFactory;

import java.util.Scanner;

public class AbstractFactoryExample {

    private Scanner scanner = new Scanner(System.in);

    public void start() {
        IChessFactory chessFactory = new ChessFactory();
        IFigure figure = chessFactory.createFigure(choseFigure(), choseChessColor());
        figure.show();
    }

    private ChessColor choseChessColor(){
        System.out.println("What the color of figure do you wanna create?\n" +
                "1:WHITE\n" +
                "2:BLACK\n");
        switch (scanner.nextInt()){
            case 1:{
                return ChessColor.WHITE;
            }
            case 2:{
                return ChessColor.BLACK;
            }
            default:{
                throw new IllegalArgumentException();
            }
        }
    }

    private Figure choseFigure(){
        System.out.println("What kind of figure do ypu wanna create?\n" +
                "1:BISHOP\n" +
                "2:KNIGHT\n" +
                "3:PAWN\n" +
                "4:ROOK\n" +
                "5:KING\n" +
                "6:QUEEN");
        switch (scanner.nextInt()){
            case 1:{
                return Figure.BISHOP;
            }
            case 2:{
                return Figure.KNIGHT;
            }
            case 3:{
                return Figure.PAWN;
            }
            case 4:{
                return Figure.ROOK;
            }
            case 5:{
                return Figure.KING;
            }
            case 6:{
                return Figure.QUEEN;
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