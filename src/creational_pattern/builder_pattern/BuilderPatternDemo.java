package creational_pattern.builder_pattern;


/**
 * <p>describe：建造者模式 （基本场景：吃火锅选配菜，打乱顺序选择配菜，最终下单上菜）
 * <p>    note：
 * <p>    note：流程模块独立，想取哪部分流程就取那部分流程
 * <p>    note：同时可以定义流程的最终初始化方法来生效流程
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
