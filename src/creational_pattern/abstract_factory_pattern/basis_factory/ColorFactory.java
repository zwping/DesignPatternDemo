package creational_pattern.abstract_factory_pattern.basis_factory;

import creational_pattern.abstract_factory_pattern.Color;
import creational_pattern.abstract_factory_pattern.Shape;
import creational_pattern.abstract_factory_pattern.impl.Blue;
import creational_pattern.abstract_factory_pattern.impl.Green;
import creational_pattern.abstract_factory_pattern.impl.Red;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (null == color) return null;
        switch (color) {
            case "red":
                return new Red();
            case "green":
                return new Green();
            case "blue":
                return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
