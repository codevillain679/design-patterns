package com.codevillain679.creational.singleton;

public class SingletonThread1 extends Thread {

    public void run(){
        System.out.println("Singleton 1 RUN");
        System.out.println(Singleton1.getInstance());
    }

}
