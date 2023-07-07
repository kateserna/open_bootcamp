import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RegistroAsistentes {
    public static void main(String[] args) {

        Scanner registro = new Scanner(System.in);
        String nombre;
        String apellido;
        String cedula ;
        String correo;
        String confirmacion;
        int intentos = 3;
        List<HashMap<String,String>> mapaPersonas = new ArrayList<>();

        //reinicia el registro
        while (true){
            System.out.println();
            try {
                //Validacion datos de Nombre, minimo 2 caracteres
                do {
                    System.out.println("Nombre: ");
                    nombre = registro.nextLine();
                } while (nombre.length() < 2);

                //Validacion datos de Apellido, minimo 2 caracteres
                do {
                    System.out.println("Apellido: ");
                    apellido = registro.nextLine();
                } while (apellido.length() < 2);

                //Validacion datos de cedula, solo numeros
                do {
                    System.out.println("Cedula (sin puntos ni espacios): ");
                    cedula = registro.nextLine();
                } while (cedula == null || !cedula.matches("[0-9]+"));

                //Validacion datos de correo
                do {
                    System.out.println("Correo: ");
                    correo = registro.nextLine();
                } while (correo == null || !correo.matches("^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@" +
                        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"));

                System.out.println("Los datos ingresados son:");
                System.out.println(nombre);
                System.out.println(apellido);
                System.out.println(cedula);
                System.out.println(correo);

                //Reinicia la confirmacion si confimracion es diferente a S/N
                while (true){
                    System.out.println("Es correcta la información?: S/N");
                    confirmacion = registro.nextLine();
                    HashMap<String,String> persona = new HashMap<>();
                    if (confirmacion.equalsIgnoreCase("S")){

                        //Guardar mapa - una persona o registro
                        persona.put("Nombre: ", nombre);
                        persona.put("Apellido: ", apellido);
                        persona.put("Cedula: ", cedula);
                        persona.put("Correo: ", correo);
                        System.out.println(persona);
                        //guardar lista de mapas de personas
                        mapaPersonas.add(persona);
                        System.out.println("Su informacion ha sido guardada");
                        break;

                    } else if ( confirmacion.equalsIgnoreCase("N")){
                        System.out.println("Porfavor vuelve a ingresar la informacion de registro");

                        break;
                    }
                }
            } catch (Exception error){
                System.out.println("Información errada");
                System.out.println("El programa ha terminado");
                System.out.println("Porfavor vuelve a ingresar la informacion de registro");
                System.exit(0);
            }
            System.out.println(mapaPersonas); //imprimir lista

            try {
                PrintStream registroAsistentes = new PrintStream("Registro_asistentes.txt");
                registroAsistentes.println(mapaPersonas);
                registroAsistentes.close();
            } catch (FileNotFoundException e) {
                System.out.println("No encuentra el archivo o el archivo está abierto: " + e.getMessage());
            }
        }
    }
}

