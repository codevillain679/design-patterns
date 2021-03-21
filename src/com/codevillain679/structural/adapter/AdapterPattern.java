package com.codevillain679.structural.adapter;

/**
 * An Adapter Pattern says that just "converts the interface of a class into another interface that a client wants".
 *
 * In other words, to provide the interface according to client requirement while using the services of a class with a different interface.
 *
 * The Adapter Pattern is also known as Wrapper.
 */

public class AdapterPattern {
    public AdapterPattern(){
        System.out.println("Duck");
        Duck donald = new Duck("Donald");
        donald.swim();
        donald.splash();
        donald.slobber();
        donald.dobber();

        System.out.println("\nHorse");
        Horse henry = new Horse("Henry");
        henry.move();
        henry.play();
        henry.eat();
        henry.sleep();

        System.out.println("\nDuck with Adapter");
        DuckAdapter donaldAdapter = new DuckAdapter(donald); //Plug donald duck into adapter
        donaldAdapter.move();
        donaldAdapter.play();
        donaldAdapter.eat();
        donaldAdapter.sleep();
    }

}
