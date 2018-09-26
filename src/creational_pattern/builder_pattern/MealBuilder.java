package creational_pattern.builder_pattern;


/**
 * <p>describe：建造者模式
 * <p>    note：
 * <p> @author：zwp on 2018/9/25 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
