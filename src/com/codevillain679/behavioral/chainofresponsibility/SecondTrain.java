package com.codevillain679.behavioral.chainofresponsibility;

public class SecondTrain implements Train{
    private int totalPassengers;
    private Train nextTrain;
    @Override
    public void setNext(Train nextTrain) {
        this.nextTrain = nextTrain;
    }

    @Override
    public void handlePassengers(int passengers) {
        totalPassengers = passengers;
        if(totalPassengers <= 20){
            System.out.println(passengers + " passengers went into the second train");
        }else{
            System.out.println("There are too much passengers to fit in the train..");
            totalPassengers -= 20;
            System.out.println("20 passengers went into the second train");
            System.out.println("Calling next train...");
            nextTrain.handlePassengers(totalPassengers);
        }
    }
}
