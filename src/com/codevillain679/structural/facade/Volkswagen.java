package com.codevillain679.structural.facade;

public class Volkswagen implements Car{
    @Override
    public void model() {
        System.out.println("VW Golf 8 2020");
    }

    @Override
    public void licencePlate() {
        System.out.println("XX-999-Y");
    }

    @Override
    public void price() {
        System.out.println("EUR 59.000,00");
    }
}
