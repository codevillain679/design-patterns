package com.codevillain679.creational.singleton;

public class SingletonThread2 extends Thread {

    public void run() {
        System.out.println("Singleton 2 RUN");
        System.out.println(Singleton2.getInstance());
    }
}
