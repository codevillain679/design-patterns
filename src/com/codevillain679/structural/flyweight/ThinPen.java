package com.codevillain679.structural.flyweight;

public class ThinPen implements Pen{

    final BrushSize brushSize = BrushSize.THIN;

    private String color = null;

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing thin "+content+" in color : " + color);
    }
}
