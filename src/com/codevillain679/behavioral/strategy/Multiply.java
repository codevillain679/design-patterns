package com.codevillain679.behavioral.strategy;

public class Multiply implements CalculateStrategy {

    @Override
    public int Calculate(int a, int b) {
        int x;
        x = a*b;
        return x;
    }
}
