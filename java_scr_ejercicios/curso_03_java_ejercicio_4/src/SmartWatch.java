public class SmartWatch extends SmartDevice{

    boolean waterproof;
    String material;
    double weight;
    String batteryLife;

    public SmartWatch (){
    }

    public SmartWatch (String brand, String color, boolean bluetooth, float screenSize, int price,
                       boolean waterproof, String material, double weight, String batteryLife){
        super(brand, color, bluetooth, screenSize, price);
        this.waterproof = waterproof;
        this.material = material;
        this.weight = weight;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "waterproof=" + waterproof +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", batteryLife='" + batteryLife + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", bluetooth=" + bluetooth +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
