package com.codevillain679.behavioral.strategy;

public class Devide implements CalculateStrategy {
    @Override
    public int Calculate(int a, int b) {
        int x;
        x = a / b;
        return x;
    }
}
