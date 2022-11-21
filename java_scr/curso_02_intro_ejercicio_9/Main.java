public class Main {
    public static void main(String[] args) {
        Cliente persona1 = new Cliente();
        persona1.nombre = "Laura";
        persona1.edad = 30;
        persona1.telefono = 3456789;
        persona1.credito = 200;

        System.out.println(persona1.nombre);
        System.out.println(persona1.edad);
        System.out.println(persona1.telefono);
        System.out.println(persona1.credito);

        Trabajador persona2 = new Trabajador();
        persona2.nombre = "Diana";
        persona2.edad = 37;
        persona2.telefono = 9876543;
        persona2.salario = 500;

        System.out.println(persona2.nombre);
        System.out.println(persona2.edad);
        System.out.println(persona2.telefono);
        System.out.println(persona2.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}