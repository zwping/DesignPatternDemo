package creational_pattern.abstract_factory_pattern.impl;

import creational_pattern.abstract_factory_pattern.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("填充蓝色");
    }
}
