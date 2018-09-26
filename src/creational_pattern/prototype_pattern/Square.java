package creational_pattern.prototype_pattern;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("绘制正方形");
    }
}