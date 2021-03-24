package com.codevillain679.creational.singleton;

public class Default {

    public Default(){
        System.out.println("Default CREATED");
    }

    public static Default getInstance(){
        return new Default();
    }
}
