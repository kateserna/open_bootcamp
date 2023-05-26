public class Funciones {
    public static void main(String[] args) {

        double precio = 50000d;
        double iva = precio * 0.19;
        double precioConIva = suma (precio, iva);
        System.out.println(precioConIva);

    }

    static double suma (double precio, double iva){
        return precio + iva;
    }
}
