package creational_pattern.prototype_pattern;


/**
 * <p>describe：原型模式 (基本场景：无)
 * <p>    note：
 * <p>    note：高性能的重复创建对象
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape + "Shape : " + clonedShape.getType());

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape1 + "Shape : " + clonedShape1.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
