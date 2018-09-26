package creational_pattern.factory_pattern;


/**
 * <p>describe：工厂模式 （基本场景：根据API获取中午吃什么，定义一个Eat接口，实现多种吃***，后用工厂类包装，用户只需要调取工厂类即可知道中午吃什么）
 * <p>    note：
 * <p>    note：单一流程不同的实现
 * <p>    note：对使用者来说只需要调用一个Factory，内部实现不用去理会
 * <p>    note：建造Factory时，只需要定义Factory的目的Interface，
 * 每次扩充目的的类型只需要再次实现Interface（扩展性，且不影响使用者的调用）
 * <p>    note：
 * <p> @author：zwp on 2018/9/21 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        factory.getShape("rectangle").draw();
        factory.getShape("square").draw();
        factory.getShape("circle").draw();

    }

}
