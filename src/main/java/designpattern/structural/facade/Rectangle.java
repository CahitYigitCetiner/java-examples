package designpattern.structural.facade;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
