package creational_patterns.abstract_factory.interfaces;

//Contrato que diz quais tipos de produtos as fábricas poderão criar
public interface IFurnitureFactory {

    public IChair createChair();
    public ICoffeeTable createCoffeeTable();
    public ISofa createSofa();

}
