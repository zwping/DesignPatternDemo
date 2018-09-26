package creational_pattern.builder_pattern;

import creational_pattern.builder_pattern.i.Item;
import creational_pattern.builder_pattern.i.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
