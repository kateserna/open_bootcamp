public class Main {
    public static void main(String[] args) {
        int numeroIf = -5;

        if (numeroIf > 0){
            System.out.println("positivo");
        } else if (numeroIf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("0");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        numeroWhile = 0;
        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        } while (numeroWhile < 1);

        for (int numeroFor = 0; numeroFor < 3; numeroFor = numeroFor + 1) {
            System.out.println( numeroFor);
        }

        var estacion = "otoño";

        switch (estacion) {
            case "verano":
                System.out.println("esta en verano");
                break;
            case "invierno":
                System.out.println("esta en invierno");
                break;
            case "otoño":
                System.out.println("esta en otoño");
                break;
            case "primavera":
                System.out.println("esta en primavera");
                break;
            default:
                System.out.println( "no es una estación");
        }

    }
}