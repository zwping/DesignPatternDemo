package creational_pattern.builder_pattern;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}
