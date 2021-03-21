package com.codevillain679.behavioral.chainofresponsibility;

public interface Train {
        void setNext(Train nextTrain);
        void handlePassengers(int passengers);
}
