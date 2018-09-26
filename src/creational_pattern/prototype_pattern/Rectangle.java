package creational_pattern.prototype_pattern;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
