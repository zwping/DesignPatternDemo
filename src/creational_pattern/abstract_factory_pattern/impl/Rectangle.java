package creational_pattern.abstract_factory_pattern.impl;


import creational_pattern.abstract_factory_pattern.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
