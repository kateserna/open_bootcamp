public class Main {
    public static void main(String[] args) {

        SmartDevice tv = new SmartDevice("lg", "black", false,  50.0f, 1750000);
        SmartPhone galaxyA54 = new SmartPhone("Samsung", "white", true, 6.4f, 2300000,
                "50 Mp", "5G", true, "256 GB", "8 GB");
        SmartWatch galaxyWatch5 = new SmartWatch("Samsung", "purple", true, 1.4f,
                1000000, true, "Armor Aluminum", 33.5, "40 hours" );

        System.out.println("TV features: " + tv);
        System.out.println("Phone features: " + galaxyA54);
        System.out.println("Watch features: " + galaxyWatch5);
    }
}