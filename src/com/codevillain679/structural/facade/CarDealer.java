package com.codevillain679.structural.facade;

public class CarDealer {
    private Car volkswagen;
    private Car tesla;

    public CarDealer(){
        volkswagen = new Volkswagen();
        tesla = new Tesla();
    }

    public void buyVolkswagen(){
        volkswagen.model();
        volkswagen.licencePlate();
        volkswagen.price();
    }

    public void buyTesla(){
        tesla.model();
        tesla.licencePlate();
        tesla.price();
    }
}
