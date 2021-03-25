package com.codevillain679.creational.singleton;

// Lazy Initialization with double lock Method (Thread safe)
// Synchronized
public class Singleton3 {

    private static Singleton3 SINGLE_INSTANCE = null;

    private Singleton3() {
        System.out.println("Singleton 3 CREATED");
    }

    public static Singleton3 getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (Singleton3.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new Singleton3();
                }
            }
        }
        return SINGLE_INSTANCE;
    }


}
