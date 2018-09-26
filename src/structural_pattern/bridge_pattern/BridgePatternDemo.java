package structural_pattern.bridge_pattern;


/**
 * <p>describe：桥接模式 （基本场景：在火锅店中点鲜榨果汁，针对果汁种类抽象化(必须会点一种果汁)，针对不同的顾客果汁浓稠度Interface化）
 * <p>    note：
 * <p>    note：抽象与抽象的实现化解耦，抽象的实现化调用Interface实现解耦
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
