package com.codevillain679.state;

public class StatePattern {
    public StatePattern() {
        var canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
