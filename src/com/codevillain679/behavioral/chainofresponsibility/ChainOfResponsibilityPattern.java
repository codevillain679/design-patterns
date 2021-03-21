package com.codevillain679.behavioral.chainofresponsibility;

/**
* As the name suggests, there is some responsibility that each objects provides and we have got them arranged as a chain.
* Starting off with the client, the client initiates an action.
* There are multiple objects that can satisfy/provide an implementation of that action depending on the context.
* The objects will be linked as a linear list in order.

The first object in the chain receiving the command or the request, looks at the context to see if it can perform that action.
* If yes, it does the work and the request gets satisfied by that object and the call ends there.
* If not, it delegates the request to the next object in the chain.
* It again does the same – sees if it can perform the action and if not passes the request to the next object in the chain.
* The next object to which each object delegates the request is called as its successor.

With this setup the object that ultimately will perform the action will not be known beforehand.
* Also, the caller or the client will not be aware of this chaining and delegation that is taking place.
* Thus, this enables us to decouple the client from the object that performs the action.

The idea of this is to decouple senders and receivers by having multiple objects an opportunity to handle a request.
* The request then gets passed along a chain of objects until one of them eventually handles it.
*/

public class ChainOfResponsibilityPattern {
    public ChainOfResponsibilityPattern(){
        Train firstTrain = new FirstTrain();
        Train secondTrain = new SecondTrain();
        Train thirdTrain = new ThirdTrain();
        firstTrain.setNext(secondTrain);
        secondTrain.setNext(thirdTrain);

        firstTrain.handlePassengers(10);

        System.out.println("---");

        firstTrain.handlePassengers(20);

        System.out.println("---");

        firstTrain.handlePassengers(100);
    }
}
