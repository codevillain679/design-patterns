package com.codevillain679.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
