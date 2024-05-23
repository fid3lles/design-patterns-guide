package creational_patterns.abstract_factory;

import creational_patterns.abstract_factory.factory.ModernFurnitureFactory;
import creational_patterns.abstract_factory.factory.VictorianFurnitureFactory;
import creational_patterns.abstract_factory.interfaces.IFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        //Abstração da escolha de família de produto do usuário
        String furnitureType = "Modern";
        //Váriavel que guardará a fábrica escolhida
        IFurnitureFactory factory = null;

        //Condicionais que decidirão qual fábrica usar de acordo com o usuário
        if(furnitureType.equals("Victorian")){
            factory = new VictorianFurnitureFactory();
        } else if (furnitureType.equals("Modern")) {
            factory = new ModernFurnitureFactory();
        } else {
            throw new RuntimeException("No furniture type informed.");
        }

        //Criando a aplicação passando a fábrica escolhida
        Application application = new Application(factory);

        //Chamando o método que cria mobílias da mesma fámilia
        application.createFurnitures();
    }
}
