package creational_pattern.abstract_factory_pattern.impl;

import creational_pattern.abstract_factory_pattern.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制正方形");
    }
}
