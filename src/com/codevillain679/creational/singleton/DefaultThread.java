package com.codevillain679.creational.singleton;

public class DefaultThread extends Thread {

    public void run() {
        System.out.println("Default RUN");
        System.out.println(Default.getInstance());
    }

}
