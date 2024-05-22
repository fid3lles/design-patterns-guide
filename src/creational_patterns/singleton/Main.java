package creational_patterns.singleton;

public class Main {

    public static void main(String[] args) {

        DataBase  db = DataBase.getInstance();
        System.out.println(db.getName());
        Main2.changeName();
        System.out.println(db.getName());
      ;

    }
}
