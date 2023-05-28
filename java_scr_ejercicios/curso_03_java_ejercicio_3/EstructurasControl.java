public class EstructurasControl {
    public static void main(String[] args) {

       String [] nombres = {"Karold ", "Sandra ", "Diana ", "Jessica ",
               "Anyela ", "Carolina ", "Claudia ", "Fatima ", "Mayra ", "Fabiola "};

       String concatenar = "" ;

       for (String nombre : nombres){
            concatenar += nombre;
       }
        System.out.println(concatenar );
    }
}
