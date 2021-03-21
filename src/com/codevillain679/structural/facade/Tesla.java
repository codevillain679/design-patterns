package com.codevillain679.structural.facade;

public class Tesla implements Car{

    @Override
    public void model() {
        System.out.println("Tesla X 2020");
    }

    @Override
    public void licencePlate() {
        System.out.println("A-111-BB");
    }

    @Override
    public void price() {
        System.out.println("EUR 80.000,00");
    }
}
