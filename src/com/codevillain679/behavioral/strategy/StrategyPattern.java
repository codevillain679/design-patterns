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
    double answer;
    double a;
    double b;
    int calculateWay;

    public StrategyPattern (){

// First will be asked for two numbers. These are not important for the strategy pattern just for this specific example
        System.out.println("Please give a positive number:");
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        System.out.println("Please give another positive number:");
        if (scanner.hasNextInt()){
            b = scanner.nextInt();
        }
/* Now will asked to make a choise at runtime. This is specific for the Strategy Pattern.
*       The user can choose the way of how the program will use the information he/she just gave.
*       In this example he/she chooses the arithmetic way of the two numbers. But it could also be a way how a search engine has to search.
**/
        System.out.println("What you want to do? \n (1)Sum \n (2)Subtract \n (3)Multiply \n (4)Divide ");
        if (scanner.hasNextInt()){
            calculateWay = scanner.nextInt();
        }
/* strategy is an interface (CalculateStrategy) which can be all arithmetic ways to calculate.
* Context is a class who turns the persons choise into a specific class of the interface CalculateStrategy.
* This has only one methode, in the switch it decides what specific class has to be return.
* */
        strategy = context.CreateCalculateStrategy(calculateWay);
        answer = strategy.Calculate(a,b);
        System.out.println(answer);
    }

}
