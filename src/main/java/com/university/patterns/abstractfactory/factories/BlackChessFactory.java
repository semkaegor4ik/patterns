package com.university.patterns.abstractfactory.factories;

import com.university.patterns.abstractfactory.interfaces.*;
import com.university.patterns.abstractfactory.models.*;

public class BlackChessFactory implements IChessFactory {
    @Override
    public IPawn createPawn() {
        return new BlackPawn();
    }

    @Override
    public IBishop createBishop() {
        return new BlackBishop();
    }

    @Override
    public IKnight createKnight() {
        return new BlackKnight();
    }

    @Override
    public IRook createRock() {
        return new BlackRook();
    }

    @Override
    public IKing createKing() {
        return new BlackKing();
    }

    @Override
    public IQueen createQueen() {
        return new BlackQueen();
    }
}
