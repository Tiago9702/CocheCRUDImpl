package BOOTCAMP.Ejemplos;

public class Main {

    public static CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.save(new Coche());
        cocheCRUD.delete(new Coche());
        cocheCRUD.findAll();

    }
}
