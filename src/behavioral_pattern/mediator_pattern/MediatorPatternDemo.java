package behavioral_pattern.mediator_pattern;


/**
 * <p>describe：中介者模式
 * <p>    note：
 * <p>    note：调用网状结构对象，创建中介对象梳理调用逻辑，生成调用方法
 * <p>    note：
 * <p> @author：zwp on 2018/9/26 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
