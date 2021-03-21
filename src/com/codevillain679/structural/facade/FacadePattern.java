package com.codevillain679.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A Facade Pattern says that just "just provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client".
 *
 * In other words, Facade Pattern describes a higher-level interface that makes the sub-system easier to use.
 *
 * Practically, every Abstract Factory is a type of Facade.
 */

public class FacadePattern {

    private static int choice;

    public FacadePattern(){
        System.out.println("--- Car shop ---" +
                "\n 1. Buy Volkswagen" +
                "\n 2. Buy Tesla\n Enter your choice: ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String str = br.readLine();
            choice = Integer.parseInt(str);
        }catch(IOException up){
            try {
                throw up; // haha see what i did here
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        CarDealer dealer = new CarDealer();

        switch (choice) {
            case 1:
            {
                System.out.println("You bought a Volkswagen");
                dealer.buyVolkswagen();
            }
            break;
            case 2:
            {
                System.out.println("You bought a Tesla");
                dealer.buyTesla();
            }
            break;
            default:
            {
                System.out.println("You left");
            }
            return;
        }


    }

}
