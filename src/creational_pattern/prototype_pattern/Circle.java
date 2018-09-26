package creational_pattern.prototype_pattern;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("绘制原型");
    }
}
