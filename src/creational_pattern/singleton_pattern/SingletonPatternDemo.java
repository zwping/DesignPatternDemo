package creational_pattern.singleton_pattern;


/**
 * <p>describe：单例模式 （基本场景：在全局中高频率调用的方法或类）
 * <p>    note：
 * <p>    note：推荐使用懒汉式或双检锁/双重校验锁（DCL，即 double-checked locking）
 * <p>    note：建议使用Live Templates一键生成单例代码
 * <p>    note：
 * <p> @author：zwp on 2018/9/21 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class SingletonPatternDemo {

    private static SingletonPatternDemo instance;

    private SingletonPatternDemo() {
    }

    public static SingletonPatternDemo getInstance() {
        if (instance == null) {
            instance = new SingletonPatternDemo();
        }
        return instance;
    }


//    private volatile static SingletonPatternDemo singleton;
//
//    private SingletonPatternDemo() {}
//
//    public static SingletonPatternDemo getSingleton() {
//        if (singleton == null) {
//            synchronized (SingletonPatternDemo.class) {
//                if (singleton == null) {
//                    singleton = new SingletonPatternDemo();
//                }
//            }
//        }
//        return singleton;
//    }
}
