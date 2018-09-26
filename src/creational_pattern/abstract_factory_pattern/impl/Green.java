package creational_pattern.abstract_factory_pattern.impl;

import creational_pattern.abstract_factory_pattern.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("填充绿色");
    }
}
