package com.codevillain679.behavioral.strategy;

public class Context {

    public CalculateStrategy CreateCalculateStrategy(int calculateWay){
        CalculateStrategy result;
        switch (calculateWay){
            case 1: result = new Sum();
                break;
            case 2: result = new Subtract();
                break;
            case 3: result = new Multiply();
                break;
            case 4: result = new Divide();
                break;
            default: result = new Sum();
        }
        return result;
    }
}
