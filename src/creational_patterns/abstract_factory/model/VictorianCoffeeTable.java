package creational_patterns.abstract_factory.model;

import creational_patterns.abstract_factory.interfaces.ICoffeeTable;

public class VictorianCoffeeTable implements ICoffeeTable {

    @Override
    public void hasDecoration() {
        System.out.println("Has ornamental borders");
    }

    @Override
    public String toString() {
        return "Victorian Coffee Table";
    }

}
