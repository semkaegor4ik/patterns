package com.university.patterns.adapter;

public class AdapterExample {
    public void start() {
        Dollar dollar = new Dollar(15);
        Ruble ruble = new Ruble(675);
        Bank bank = new Bank();
        RubleAdapter rubleAdapter = new RubleAdapter(ruble);
        System.out.println(bank.GiveAEuro(dollar));
        //System.out.println(bank.GiveAEuro(ruble));                не можем!!
        System.out.println(bank.GiveAEuro(rubleAdapter));
    }
}
