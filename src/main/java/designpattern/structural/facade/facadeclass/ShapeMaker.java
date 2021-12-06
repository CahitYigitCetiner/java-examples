package designpattern.structural.facade.facadeclass;

import designpattern.structural.facade.Circle;
import designpattern.structural.facade.Rectangle;
import designpattern.structural.facade.Shape;
import designpattern.structural.facade.Square;

/**
 * -- Facade Class --
 * Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * Wrap a complicated subsystem with a simpler interface.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public void drawCircle() {
        circle = new Circle();
        circle.draw();
    }

    public void drawRectangle() {
        rectangle = new Rectangle();
        rectangle.draw();
    }

    public void drawSquare() {
        square = new Square();
        square.draw();
    }

}
