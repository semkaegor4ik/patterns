package com.university.patterns.adapter;

public class RubleAdapter extends  Dollar {
    private Ruble ruble;

    public RubleAdapter(Ruble ruble) {
        this.ruble = ruble;
    }

    @Override
    public double getCount(){
        return ruble.getCount() * 0.013;
    }
}
