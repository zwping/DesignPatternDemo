package creational_pattern.builder_pattern;

import creational_pattern.builder_pattern.i.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "包装";
    }
}
