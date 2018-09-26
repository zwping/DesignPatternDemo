package creational_pattern.factory_pattern.impl;

import creational_pattern.factory_pattern.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制圆");
    }
}
