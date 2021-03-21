package com.codevillain679.structural.flyweight;

public class ThiccPen implements Pen {

    final BrushSize brushSize = BrushSize.THICC;    //intrinsic state - shareable
    private String color = null;                    //extrinsic state - supplied by client

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing THICC "+content+" in color : " + color);
    }
}