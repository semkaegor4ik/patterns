package com.university.patterns.abstractfactory.factories;

import com.university.patterns.abstractfactory.interfaces.*;
import com.university.patterns.abstractfactory.models.BlackFigure;
import com.university.patterns.abstractfactory.models.WhiteFigure;

public class PawnFactory implements IChessFactory {
    @Override
    public IBlackFigure createBlackFigure() {
        return new BlackFigure();
    }

    @Override
    public IWhiteFigure createWhiteFigure() {
        return new WhiteFigure();
    }
}
