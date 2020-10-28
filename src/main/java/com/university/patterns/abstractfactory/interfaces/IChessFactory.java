package com.university.patterns.abstractfactory.interfaces;

public interface IChessFactory {
    IBlackFigure createBlackFigure();
    IWhiteFigure createWhiteFigure();
}
