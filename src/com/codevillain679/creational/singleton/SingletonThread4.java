package com.codevillain679.creational.singleton;

// By using nested Inner class (Lazy Load method):
public class SingletonThread4 extends Thread {

    public void run() {
        System.out.println("Singleton 4 RUN");
        System.out.println(Singleton4.getInstance());
    }
}
