package com.university.patterns.adapter;

public class Bank {
    public double GiveAEuro(Dollar dollar){
        return dollar.getCount() * 0.85;
    }
}
