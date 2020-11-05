package com.university.patterns.abstractfactory.interfaces;

public interface IChessFactory {
    IPawn createPawn();
    IBishop createBishop();
    IKnight createKnight();
    IRook createRock();
    IKing createKing();
    IQueen createQueen();
}
