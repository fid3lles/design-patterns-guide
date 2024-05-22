package creational_patterns.abstract_factory.interfaces;

public interface IFurnitureFactory {

    public IChair createChair();
    public ICoffeeTable createCoffeeTable();
    public ISofa createSofa();

}
