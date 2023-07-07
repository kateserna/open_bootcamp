import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        //cadena al revés
        String cadena = "Esta es la prueba";
        System.out.println("La cadena es: " + cadena);
        String cadenaInvertida = reverse (cadena);
        System.out.println("Cadena al revés: " + cadenaInvertida);

        //Array unidimensional
        String casa [] = {"mesa", "sofá", "computador", "cama"};
        for (String i : casa) {
            System.out.println("Valor actual de la cadena: " + i);
        }

        //Array bidimensional
        int numeros [] [] = {
                {2, 4, 6, 8},
                {20, 40, 60, 80}
        };
        for (int j = 0; j < numeros.length; j++ ){
            for (int k = 0; k < numeros[1].length; k++){
                System.out.println("Estoy en la posicion j = " + j + ", k = " + k + ", El valor es = " + numeros[j][k]);
            }
        }

        //Vector
        Vector<String> nombres = new Vector<>();
        nombres.add("Pedro");
        nombres.add("Gerónimo");
        nombres.add("Juan");
        nombres.add("Mateo");
        nombres.add("Martín");
        System.out.println("Datos del vector: " + nombres); //vector completo
        nombres.remove(1);
        nombres.remove(1);
        System.out.println("Datos del vector: " + nombres); // con 2do y 3er elemento eliminado

        /*
        4. El problema al usar un vector con la capacidad por defecto si tengo 1000 elementos para ser añadidos al
         mismo es que cada vez que se sobrepasa la capacidad del vector, por debajo se crea un nuevo array donde se
         copian los elementos que tenga el vector en el momento y a continuacion se ingresan los elementos nuevos, por
         esto cada vez que se amplia la capacidad del vector automaticamente se copia el array por debajo e ingresa
         los nuevos elementos siendo esta una operacion costosa en la memoria del ordenador. Se debe buscar el minimo
         de ampliaciones del vector, definiendo la capacidad lo mas cerca a la realidad posible.

         */

        // ArrayList de tipo String y copiar en LinkedList
        ArrayList<String> canciones = new ArrayList<>();
        canciones.add("For You");
        canciones.add("My Time");
        canciones.add("Stay Gold");
        canciones.add("Falling");

        System.out.println("Este es el contenido del ArrayList: ");
        for (String cancion : canciones){
            System.out.println(cancion);
        }

        LinkedList<String> canciones2 = new LinkedList<>(canciones);
        System.out.println("Este es el contenido de la LinkedList: ");
        for (int i = 0; i < canciones2.size(); i ++){
            System.out.println(canciones2.get(i));
        }

        //ArrayList de tipo int, con bucle rrellenarlo de 1 - 10, recorrerlo y eliminar numeros pares, recorrerlo nuevamente y mostrar el ArrayList final.
        ArrayList<Integer> arrayNumeros = new ArrayList<>(10);
        for (int i = 1; i < 11; i++) {
            arrayNumeros.add(i);
        }
        System.out.println(arrayNumeros);

        for (int i = 0; i < arrayNumeros.size(); i++){
            if (arrayNumeros.get(i) % 2 == 0 ){
                arrayNumeros.remove(i);
            }
        }
        System.out.println(arrayNumeros);

        //funcion DividePorCero con excepcion
        try {
            int resultadoDivide = dividePorCero(8, 2);
            System.out.println(resultadoDivide);
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        // Usar InputStream y PrintStream con los ficheros fileIn y fileOut

        boolean copiaDeFichero = copiarFichero("C:\\Users\\Holberton_49\\Kathe\\obc\\modulo3_java_basico\\curso_03_java_ejercicio_6\\prueba.txt", "prueba_destino.txt");

        System.out.println("\n Fichero copiado: " + copiaDeFichero);
    }

    public static String reverse(String texto){
        String cadenaTemp = "";
        for (int x = texto.length() - 1; x >= 0; x--)
            cadenaTemp = cadenaTemp + texto.charAt(x);
        return cadenaTemp;
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado;
    }

    // Usar InputStream y PrintStream con los ficheros fileIn y fileOut
    public static boolean copiarFichero (String fileIn, String fileOut){
        try {
            InputStream ficheroInicial = new FileInputStream(fileIn);
            byte [] datos = null;
            try {
                datos = ficheroInicial.readAllBytes();
                ficheroInicial.close();
            }catch (Exception e){
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }

            for (byte dato : datos) {
                System.out.print((char)dato);
            }

            PrintStream ficheroCopiado = new PrintStream(fileOut);
            ficheroCopiado.write(datos);
            ficheroCopiado.close();
            return true;

        } catch (Exception e){
            System.out.println("El programa da error: " + e.getMessage());
            return false;
        }
    }
}
