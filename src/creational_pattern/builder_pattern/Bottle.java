package creational_pattern.builder_pattern;

import creational_pattern.builder_pattern.i.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶装";
    }
}
