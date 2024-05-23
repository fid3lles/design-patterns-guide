package creational_patterns.abstract_factory.model;

import creational_patterns.abstract_factory.interfaces.IChair;

/*
    Classe que diz como uma cadeira moderna implementará
    os métodos obrigatórios definidos pela interface IChair
 */

public class ModernChair implements IChair {
    @Override
    public void hasLegs() {
        System.out.println("Has no legs.");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting");
    }

    @Override
    public String toString() {
        return "Modern Chair";
    }
}
