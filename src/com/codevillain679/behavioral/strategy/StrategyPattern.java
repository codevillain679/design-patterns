package com.codevillain679.behavioral.strategy;

import java.util.Scanner;
/**
 * The Strategy Design Pattern is a behavioural design pattern.
 * It allows an user to choose which strategy he want to use.
 * In this case the user can choose which mathstrategy he want to use for the calculation.
 */

public class StrategyPattern {
    Scanner scanner = new Scanner(System.in);
    Context context = new Context();
    CalculateStrategy strategy;
    int answer;
    int a;
    int b;
    int calculateWay;

    public StrategyPattern (){


        System.out.println("Please give a positive number:");
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        System.out.println("Please give another postive number:");
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        System.out.println("What you want to do? \n (1)Sum \n (2)Subtract \n (3)Multiply \n (4)Devide ");
        if (scanner.hasNextInt()){
            calculateWay = scanner.nextInt();
        }
        strategy = context.CreateCalculateStrategy(calculateWay);
        answer = strategy.Calculate(a,b);
        System.out.println(answer);
    }

}
