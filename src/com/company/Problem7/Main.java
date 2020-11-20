package com.company.Problem7;

public class Main {
    public static void main( String[] args ) {
        CurrencyConverter currencyConverter = new CurrencyConverter();

        //Dram from, ruble to
        Dram dram = new Dram(1000000);
        Ruble ruble = new Ruble();

        Ruble ruble1 = currencyConverter.convert(ruble, dram);
        System.out.println(dram.getCurrency() + " dram is -> " + ruble1.getCurrency() + " ruble");

        //Dram from, Dollar to
        Dram dram1 = new Dram(2000000);
        Dollar dollar = new Dollar();

        Dollar dollar1 = currencyConverter.convert(dollar, dram1);
        System.out.println(dram1.getCurrency() + " dram is -> " + dollar1.getCurrency() + " dollar");

        System.out.println();

        //Dollar from, Ruble to
        Dollar dollar2 = new Dollar(1500);
        Ruble ruble2 = new Ruble();

        Ruble ruble3 = currencyConverter.convert(ruble2, dollar2);
        System.out.println(dollar2.getCurrency() + " dollar is -> " + ruble3.getCurrency() + " ruble");

        //Dollar from, Dram to
        Dollar dollar3 = new Dollar(3000);
        Dram dram2 = new Dram();

        Dram dram3 = currencyConverter.convert(dram2, dollar3);
        System.out.println(dollar3.getCurrency() + " dollars is -> " + dram3.getCurrency() + " dram");

        System.out.println();

        //Ruble from, Dram to
        Ruble ruble4 = new Ruble(100000);
        Dram dram4 = new Dram();

        Dram dram5 = currencyConverter.convert(dram4, ruble4);
        System.out.println(ruble4.getCurrency() + " ruble is -> " + dram5.getCurrency() + " dram");

        //Ruble from, Dollar to
        Ruble ruble5 = new Ruble(200000);
        Dollar dollar4 = new Dollar();

        Dollar dollar5 = currencyConverter.convert(dollar4, ruble5);
        System.out.println(ruble5.getCurrency() + " ruble is -> " + dollar5.getCurrency() + " dollar");
    }
}
