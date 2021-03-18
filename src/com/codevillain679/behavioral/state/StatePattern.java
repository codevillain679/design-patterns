package com.codevillain679.behavioral.state;

public class StatePattern {
    public StatePattern() {
        var canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
