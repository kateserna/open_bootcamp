public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();


        cocheCRUD.save(cocheCRUD);

        cocheCRUD.findAll(cocheCRUD);

        cocheCRUD.delete(cocheCRUD);





    }
}
