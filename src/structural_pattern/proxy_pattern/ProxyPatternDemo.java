package structural_pattern.proxy_pattern;


/**
 * <p>describe：代理模式
 * <p>    note：
 * <p>    note：通过代理实现原有功能，可以对原有功能进行可控的控制(如果不加于控制就相当于多此一举)
 * <p>    note：（图片加载三层缓存）
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }

}
