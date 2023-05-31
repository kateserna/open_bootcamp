public class SmartDevice {
    String brand;
    String color;
    boolean bluetooth;
    float screenSize;
    int price;

    public SmartDevice (){
    }

    public SmartDevice (String brand, String color, boolean bluetooth, float screenSize, int price){
        this.brand = brand;
        this.color =color;
        this.bluetooth = bluetooth;
        this.screenSize = screenSize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", bluetooth=" + bluetooth +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
