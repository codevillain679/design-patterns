package com.codevillain679.creational.singleton;

// Synchronized Method (Thread safe)
public class Singleton4 {

    private static Singleton4 SINGLE_INSTANCE;

    private Singleton4() {
        System.out.println("Singleton 4 CREATED");
    }

    public static synchronized Singleton4 getInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new Singleton4();
        }
        return SINGLE_INSTANCE;
    }


}
