package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.interfaces.IChair;
import creational_patterns.abstract_factory.interfaces.ICoffeeTable;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.ISofa;
import creational_patterns.abstract_factory.model.VictorianChair;
import creational_patterns.abstract_factory.model.VictorianCoffeeTable;
import creational_patterns.abstract_factory.model.VictorianSofa;

public class VictorianFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }
}
