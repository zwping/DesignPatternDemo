package behavioral_pattern.template_pattern;


/**
 * <p>describe：模板模式
 * <p>    note：
 * <p>    note：Base系列的标准，在低层面定义模板标准，高层面定制
 * <p>    note：
 * <p> @author：zwp on 2018/9/26 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
