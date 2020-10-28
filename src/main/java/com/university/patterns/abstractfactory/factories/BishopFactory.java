package com.university.patterns.abstractfactory.factories;

import com.university.patterns.abstractfactory.interfaces.IBlackFigure;
import com.university.patterns.abstractfactory.interfaces.IChessFactory;
import com.university.patterns.abstractfactory.interfaces.IWhiteFigure;
import com.university.patterns.abstractfactory.models.BlackFigure;
import com.university.patterns.abstractfactory.models.WhiteFigure;

public class BishopFactory implements IChessFactory {
    @Override
    public IBlackFigure createBlackFigure() {
        return new BlackFigure();
    }

    @Override
    public IWhiteFigure createWhiteFigure() {
        return new WhiteFigure();
    }
}
