package com.codevillain679.behavioral.state;

public class Canvas {
    private Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

}
