package com.codevillain679.creational.singleton;

/*
    A singleton class is a class that can have only ONE object (an instance of the class) at a time per instance.
    There are various ways to design/code a singleton class.
    
    Bron: https://dzone.com/articles/singleton-in-java
    Bron: https://www.youtube.com/watch?v=VGLjQuEQgkI
 */
public class SingletonPattern {
    public SingletonPattern() {
        try {

            // Default class creation
            DefaultThread d1 = new DefaultThread();
            DefaultThread d2 = new DefaultThread();
            d1.start();
            d2.start();

            // Wait on threads to end
            d1.join();
            d2.join();

            System.out.println("");

            // Singleton 1
            SingletonThread1 t1_1 = new SingletonThread1();
            SingletonThread1 t1_2 = new SingletonThread1();
            t1_1.start();
            t1_2.start();

            // Wait on threads to end
            t1_1.join();
            t1_2.join();

            // print empty space
            System.out.println("");

            // Singleton 1
            SingletonThread2 t2_1 = new SingletonThread2();
            SingletonThread2 t2_2 = new SingletonThread2();
            t2_1.run();
            t2_2.run();

            // Wait on threads to end
            t2_1.join();
            t2_2.join();

            // print empty space
            System.out.println("");

            // Singleton 3
            SingletonThread3 t3_1 = new SingletonThread3();
            SingletonThread3 t3_2 = new SingletonThread3();
            t3_1.run();
            t3_2.run();

            // Wait on threads to end
            t3_1.join();
            t3_2.join();

            // print empty space
            System.out.println("");

            // Singleton 3
            SingletonThread4 t4_1 = new SingletonThread4();
            SingletonThread4 t4_2 = new SingletonThread4();
            t4_1.run();
            t4_2.run();

            // Wait on threads to end
            t3_1.join();
            t3_2.join();

            // print empty space and end text
            System.out.println("");
            System.out.println("The end");

        } catch (Exception ex) {
            System.out.println("Error!!: " + ex.getMessage());
        }

    }
}
