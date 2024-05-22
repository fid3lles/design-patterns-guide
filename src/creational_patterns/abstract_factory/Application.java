package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.interfaces.IChair;
import creational_patterns.abstract_factory.interfaces.ICoffeeTable;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.ISofa;

public class Application {
    private IFurnitureFactory factory;
    private ISofa sofa;
    private IChair chair;
    private ICoffeeTable coffeeTable;

    public Application(IFurnitureFactory factory) {
        this.factory = factory;
    }

    public void createFurnitures() {
        System.out.println("Creating furnitures:");
        System.out.println(factory.createChair());
        System.out.println(factory.createSofa());
        System.out.println(factory.createCoffeeTable());
    }

    public void sitPeople() {

    }

}
