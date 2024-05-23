package creational_patterns.abstract_factory.model;

import creational_patterns.abstract_factory.interfaces.ICoffeeTable;

public class ModernCoffeeTable implements ICoffeeTable {
    @Override
    public void hasDecoration() {
        System.out.println("No decoration.");
    }
}
