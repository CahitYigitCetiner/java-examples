package designpattern.structural.facade.main;

import designpattern.structural.facade.facadeclass.ShapeMaker;

public class FacadeMain {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
