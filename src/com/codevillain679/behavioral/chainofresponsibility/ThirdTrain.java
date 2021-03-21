package com.codevillain679.behavioral.chainofresponsibility;

public class ThirdTrain implements Train{
    private int totalPassengers;
    private Train nextTrain;

    @Override
    public void setNext(Train nextTrain) {
        this.nextTrain = nextTrain;
    }

    @Override
    public void handlePassengers(int passengers) {
        totalPassengers = passengers;
        if(totalPassengers <= 30){
            System.out.println(passengers + " passengers went into the third train");
        }else{
            System.out.println("There are too much passengers to fit in the train..");
            totalPassengers -= 30;
            System.out.println("30 passengers went into the third train");
            System.out.println("Calling next train...");
            System.out.println("Hmm.. seems like the next train will never arrive..");
            if(totalPassengers > 0){
                System.out.println(totalPassengers + " potential passengers left the station..");
            }
            //nextTrain.handlePassengers(totalPassengers);
        }
    }
}
