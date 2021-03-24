package com.codevillain679.creational.singleton;

// Lazy Initialization (most common)
public class Singleton2 {

    private static Singleton2 SINGLE_INSTANCE = null;

    private Singleton2() {
        System.out.println("Singleton 2 CREATED");
    }

    public static Singleton2 getInstance() {

        if (SINGLE_INSTANCE == null) {
            synchronized (Singleton2.class) {
                SINGLE_INSTANCE = new Singleton2();
            }
        }
        return SINGLE_INSTANCE;
    }
}
