package creational_pattern.abstract_factory_pattern.basis_factory;

import creational_pattern.abstract_factory_pattern.Color;
import creational_pattern.abstract_factory_pattern.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
