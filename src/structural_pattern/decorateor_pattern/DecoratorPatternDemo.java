package structural_pattern.decorateor_pattern;


/**
 * <p>describe：装饰器模式
 * <p>    note：
 * <p>    note：每一次的派生都可对对象进行新的装饰（功能增强）
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
