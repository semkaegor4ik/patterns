package com.university.patterns.abstractfactory.factories;

import com.university.patterns.abstractfactory.interfaces.*;
import com.university.patterns.abstractfactory.models.*;

public class WhiteChessFactory implements IChessFactory {
    @Override
    public IPawn createPawn() {
        return new WhitePawn();
    }

    @Override
    public IBishop createBishop() {
        return new WhiteBishop();
    }

    @Override
    public IKnight createKnight() {
        return new WhiteKnight();
    }

    @Override
    public IRook createRock() {
        return new WhiteRook();
    }

    @Override
    public IKing createKing() {
        return new WhiteKing();
    }

    @Override
    public IQueen createQueen() {
        return new WhiteQueen();
    }
}
