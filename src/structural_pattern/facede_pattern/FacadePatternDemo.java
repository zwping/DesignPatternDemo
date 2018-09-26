package structural_pattern.facede_pattern;


/**
 * <p>describe：外观模式
 * <p>    note：
 * <p>    note：缩小方法调用的范围，固化方法参数；可用枚举之类可扩充的参数增加方法灵活度
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}