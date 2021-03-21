package com.codevillain679.behavioral.chainofresponsibility;

public class FirstTrain implements Train{
    int totalPassengers;
    private Train nextTrain;

    @Override
    public void setNext(Train nextTrain) {
        this.nextTrain = nextTrain;
    }

    @Override
    public void handlePassengers(int passengers) {
        totalPassengers = passengers;
        if(totalPassengers <= 10){
            System.out.println(passengers + " passengers went into the first train");
        }else{
            System.out.println("There are too much passengers to fit in the train..");
            totalPassengers -= 10;
            System.out.println("10 passengers went into the first train");
            System.out.println("Calling next train...");
            nextTrain.handlePassengers(totalPassengers);
        }
    }
}
