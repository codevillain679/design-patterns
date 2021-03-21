package com.codevillain679.behavioral.state;

/**
* The State Design Pattern is a behavioural design pattern.
* It allows an object to alter its behavior when its internal state changes.
* The object will appear to change its class.
*/

public class StatePattern {
    public StatePattern() {
        //var canvas = new Canvas(new BrushTool());  //--> different Tool means different internal state of Canvas
        var canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
