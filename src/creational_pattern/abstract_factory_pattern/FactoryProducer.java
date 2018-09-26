package creational_pattern.abstract_factory_pattern;

import creational_pattern.abstract_factory_pattern.basis_factory.AbstractFactory;
import creational_pattern.abstract_factory_pattern.basis_factory.ColorFactory;
import creational_pattern.abstract_factory_pattern.basis_factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (null == choice) return null;
        switch (choice) {
            case "shape":
                return new ShapeFactory();
            case "color":
                return new ColorFactory();
        }
        return null;
    }
}
