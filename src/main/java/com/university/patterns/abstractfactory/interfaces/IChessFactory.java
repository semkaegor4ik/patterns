package com.university.patterns.abstractfactory.interfaces;

import com.university.patterns.abstractfactory.models.ChessColor;
import com.university.patterns.abstractfactory.models.Figure;

public interface IChessFactory {
    IFigure createFigure(Figure figure, ChessColor color);
}
