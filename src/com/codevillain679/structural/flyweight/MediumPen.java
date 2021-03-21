package com.codevillain679.structural.flyweight;

public class MediumPen implements Pen {

    final BrushSize brushSize = BrushSize.MEDIUM;
    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing medium "+content+" in color : " + color);
    }
}