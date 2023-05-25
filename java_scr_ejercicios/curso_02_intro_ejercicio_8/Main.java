public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(30);
        persona1.setNombre("Laura");
        persona1.setTelefono(3456789);

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
   public int getEdad() {
       return this.edad;
   }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }

}

