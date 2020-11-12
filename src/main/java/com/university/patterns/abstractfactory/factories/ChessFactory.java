package com.university.patterns.abstractfactory.factories;

import com.university.patterns.abstractfactory.interfaces.*;
import com.university.patterns.abstractfactory.models.*;

public class ChessFactory implements IChessFactory {

    @Override
    public IFigure createFigure(Figure figure, ChessColor chessColor) {
        switch (chessColor){
            case WHITE:{
                switch (figure){
                    case KING:
                        return new WhiteKing();
                    case PAWN:
                        return  new WhitePawn();
                    case ROOK:
                        return new WhiteRook();
                    case QUEEN:
                        return new WhiteQueen();
                    case BISHOP:
                        return  new WhiteBishop();
                    case KNIGHT:
                        return new WhiteKnight();
                    default:
                        throw new IllegalArgumentException();
                }
            }
            case BLACK:{
                switch (figure){
                    case KING:
                        return new BlackKing();
                    case PAWN:
                        return  new BlackPawn();
                    case ROOK:
                        return new BlackRook();
                    case QUEEN:
                        return new BlackQueen();
                    case BISHOP:
                        return  new BlackBishop();
                    case KNIGHT:
                        return new BlackKnight();
                    default:
                        throw new IllegalArgumentException();
                }
            }
            default:
                throw new IllegalArgumentException();
        }
    }
}
