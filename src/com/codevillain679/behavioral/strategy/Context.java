package com.codevillain679.behavioral.strategy;

public class Context {

    public CalculateStrategy CreateCalculateStrategy(int calculateWay){
        CalculateStrategy result;
        switch (calculateWay){
            case 1: result = new Sum();
            case 2: result = new Subtract();
            case 3: result = new Multiply();
            case 4: result = new Devide();
                break;
            default: result = new Sum();
        }
        return result;
    }
}
