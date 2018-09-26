package behavioral_pattern.observer_pattern;


/**
 * <p>describe：观察者模式
 * <p>    note：
 * <p>    note：对象之间存在一对多关系时
 * <p>    note：网络请求
 * <p>    note：
 * <p> @author：zwp on 2018/9/26 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
