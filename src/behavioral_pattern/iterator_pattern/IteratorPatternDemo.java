package behavioral_pattern.iterator_pattern;

/**
 * <p>describe：迭代器模式
 * <p>    note：
 * <p>    note：List迭代器遍历
 * <p>    note：
 * <p> @author：zwp on 2018/9/26 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class IteratorPatternDemo {


    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
