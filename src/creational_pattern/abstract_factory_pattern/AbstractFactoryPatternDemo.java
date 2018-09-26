package creational_pattern.abstract_factory_pattern;

import creational_pattern.abstract_factory_pattern.basis_factory.AbstractFactory;


/**
 * <p>describe：抽象工厂模式 (基本场景：去商场吃火锅+喝奶茶，定义火锅和奶茶的API，实现得到不同火锅和奶茶；创建一个抽象工厂类得到火锅和奶茶抽象类，分别实现火锅和奶茶抽象类；最后创建用户使用的工厂类的包装类)
 * <p>    note：
 * <p>    note：系列方法的统一管理
 * <p>    note：抽象工厂模式较于工厂模式，可以应对一个流程多种功能中多个功能分支；EG：制造一辆车，需要多个部门制造多种零件
 * <p>    note：
 * <p> @author：zwp on 2018/9/21 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("circle").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        colorFactory.getColor("red").fill();
        colorFactory.getColor("green").fill();
        colorFactory.getColor("blue").fill();

    }
}
