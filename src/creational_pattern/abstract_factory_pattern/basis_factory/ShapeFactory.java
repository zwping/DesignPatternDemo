package creational_pattern.abstract_factory_pattern.basis_factory;

import creational_pattern.abstract_factory_pattern.Color;
import creational_pattern.abstract_factory_pattern.Shape;
import creational_pattern.abstract_factory_pattern.impl.Circle;
import creational_pattern.abstract_factory_pattern.impl.Rectangle;
import creational_pattern.abstract_factory_pattern.impl.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (null == shape) return null;
        switch (shape) {
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            case "circle":
                return new Circle();
        }
        return null;
    }
}
