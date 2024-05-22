package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.factory.ModernFurnitureFactory;
import creational_patterns.abstract_factory.factory.VictorianFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        String furnitureType = "Modern";
        IFurnitureFactory factory = null;

        if(furnitureType.equals("Victorian")){
            factory = new VictorianFurnitureFactory();
        } else if (furnitureType.equals("Modern")) {
            factory = new ModernFurnitureFactory();
        } else {
            throw new RuntimeException("No furniture type informed.");
        }

        Application application = new Application(factory);
        application.createFurnitures();
    }
}
