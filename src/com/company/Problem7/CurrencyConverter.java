package com.company.Problem7;

public class CurrencyConverter {

    //Dram from, Ruble to
    public Ruble convert( Ruble ruble, Dram dram ) {
        ruble.setCurrency(dram.getCurrency() / 6.61);

        return ruble;
    }

    //Dram from, Dollar to
    public Dollar convert( Dollar dollar, Dram dram ) {
        dollar.setCurrency(dram.getCurrency() / 503.22);

        return dollar;
    }

    //Dollar from, Ruble to
    public Ruble convert( Ruble ruble, Dollar dollar ) {
        ruble.setCurrency(dollar.getCurrency() * 76.11);

        return ruble;
    }

    //Dollar from, Dram to
    public Dram convert( Dram dram, Dollar dollar ) {
        dram.setCurrency(dollar.getCurrency() * 503.22);

        return dram;
    }

    //Ruble from, Dram to
    public Dram convert( Dram dram, Ruble ruble ) {
        dram.setCurrency(ruble.getCurrency() * 6.61);

        return dram;
    }

    //Ruble from, Dollar to
    public Dollar convert( Dollar dollar, Ruble ruble ) {
        dollar.setCurrency(ruble.getCurrency() / 76.11);

        return dollar;
    }
}
