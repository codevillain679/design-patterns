package com.codevillain679.behavioral.strategy;

public class Divide implements CalculateStrategy {
    @Override
    public double Calculate(double a, double b) {
        double x;
        x = a / b;
        return x;
    }
}
