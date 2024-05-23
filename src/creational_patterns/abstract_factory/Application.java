package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.interfaces.IChair;
import creational_patterns.abstract_factory.interfaces.ICoffeeTable;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.ISofa;

public class Application {

    //A aplicação pode receber qualquer fábrica
    private final IFurnitureFactory factory;

    //A fábrica é escolhida via construtor
    public Application(IFurnitureFactory factory) {
        this.factory = factory;
    }

    /*
        Nossa aplicação tem um método chamado criar mobílias
        que retorna móveis da mesma família, graças a fábrica escolhida
     */
    public void createFurnitures() {
        System.out.println("Creating furnitures:");
        System.out.println(factory.createChair());
        System.out.println(factory.createSofa());
        System.out.println(factory.createCoffeeTable());
    }

}
