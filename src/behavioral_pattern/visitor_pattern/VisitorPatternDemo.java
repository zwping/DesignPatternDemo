package behavioral_pattern.visitor_pattern;


/**
 * <p>describe：访问者模式
 * <p>    note：
 * <p>    note：数据结构和数据操作分离
 * <p>    note：
 * <p> @author：zwp on 2018/9/26 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
