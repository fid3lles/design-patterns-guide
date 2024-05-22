package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.interfaces.IChair;
import creational_patterns.abstract_factory.interfaces.ICoffeeTable;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.ISofa;
import creational_patterns.abstract_factory.model.ModernChair;
import creational_patterns.abstract_factory.model.ModernCoffeeTable;
import creational_patterns.abstract_factory.model.ModernSofa;

public class ModernFurnitureFactory implements IFurnitureFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ICoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }
}
