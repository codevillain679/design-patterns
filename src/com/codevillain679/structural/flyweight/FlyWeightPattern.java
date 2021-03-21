package com.codevillain679.structural.flyweight;

/**
 * A Flyweight Pattern says that just "to reuse already existing similar kind of objects by storing them and create new object when no matching object is found".
 *
 * Advantage of Flyweight Pattern
 * It reduces the number of objects.
 * It reduces the amount of memory and storage devices required if the objects are persisted
 * Usage of Flyweight Pattern
 * When an application uses number of objects
 * When the storage cost is high because of the quantity of objects.
 * When the application does not depend on object identity.
 */
public class FlyWeightPattern {
    public FlyWeightPattern() {

        Pen yellowThinPen1 = PenFactory.getThiccPen("YELLOW");  //created new pen
        yellowThinPen1.draw("origami eagle");

        Pen yellowThinPen2 = PenFactory.getThiccPen("YELLOW");  //pen is shared
        yellowThinPen2.draw("beautiful drawing");

        Pen blueThinPen = PenFactory.getThiccPen("BLUE");       //created new pen
        blueThinPen.draw("broom and stick");

        System.out.println(yellowThinPen1.hashCode());
        System.out.println(yellowThinPen2.hashCode());

        System.out.println("Notice the two hashCodes above are identical although we newly created them!");

        System.out.println(blueThinPen.hashCode());
    }
}
