package creational_pattern.factory_pattern;

import creational_pattern.factory_pattern.impl.Circle;
import creational_pattern.factory_pattern.impl.Rectangle;
import creational_pattern.factory_pattern.impl.Square;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (null == shapeType) return null;
        switch (shapeType) {
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
