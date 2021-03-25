package com.codevillain679;

import com.codevillain679.behavioral.chainofresponsibility.ChainOfResponsibilityPattern;
import com.codevillain679.behavioral.memento.MementoPattern;
import com.codevillain679.behavioral.state.StatePattern;
import com.codevillain679.creational.builder.BuilderPattern;
import com.codevillain679.creational.singleton.SingletonPattern;
import com.codevillain679.structural.adapter.AdapterPattern;
import com.codevillain679.structural.facade.FacadePattern;
import com.codevillain679.structural.flyweight.FlyWeightPattern;

public class Main {

    public static void main(String[] args) {

        // -- Behavioural patterns --
        // new MementoPattern();
        // new StatePattern();
        // new ChainOfResponsibilityPattern();


        // -- Structural patterns --
        // new AdapterPattern();
        // new FacadePattern();
        // new FlyWeightPattern();

        // -- Creational patterns --
        //new BuilderPattern();
        new SingletonPattern();
    }
}
