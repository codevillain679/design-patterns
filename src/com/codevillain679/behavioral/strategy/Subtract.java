package com.codevillain679.behavioral.strategy;

public class Subtract implements CalculateStrategy {

    @Override
    public int Calculate(int a, int b) {
        int x;
        x = a-b;
        return x;
    }
}
