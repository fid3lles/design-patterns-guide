package creational_patterns.abstract_factory.model;

import creational_patterns.abstract_factory.interfaces.IChair;

public class VictorianChair implements IChair {

    @Override
    public void hasLegs() {
        System.out.println("Has legs!");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting");
    }

    @Override
    public String toString() {
        return "Victorian Chair";
    }

}
