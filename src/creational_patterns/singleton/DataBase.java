package creational_patterns.singleton;


public class DataBase {

    private static DataBase instance;
    private  String name;

    //todo: Construtor Privado nao permite DataBase db = new DataBase();
    private DataBase() {
        this.name = "Maria";
    }

    //todo:Verifica se o Objeto DataBase ja foi criado, caso ele ja exista, retorna o objeto ja existente com os valores preenchidos anteriormente
    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return DataBase.instance;
    }

    public void query(String sql) {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
