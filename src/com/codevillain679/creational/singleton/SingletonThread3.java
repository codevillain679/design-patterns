package com.codevillain679.creational.singleton;

public class SingletonThread3 extends Thread {

    public void run() {
        System.out.println("Singleton 3 RUN");
        System.out.println(Singleton3.getInstance());
    }

}
