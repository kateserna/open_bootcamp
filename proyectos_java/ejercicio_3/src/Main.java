public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma( 30, 20, 10);
        System.out.println(resultado);

        coche miCoche = new coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}
class coche {
    public int puertas = 0;
    public void SumarPuertas(){
        this.puertas++;
    }
}