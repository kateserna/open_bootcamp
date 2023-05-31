public class SmartPhone extends SmartDevice {

    String camera;
    String bands;
    boolean fingerprintReader;
    String storage;
    String ram;

    public SmartPhone (){
    }

    public SmartPhone (String brand, String color, boolean bluetooth, float screenSize, int price,
                       String camera, String bands, boolean fingerprintReader, String storage, String ram){
        super(brand, color, bluetooth, screenSize, price);
        this.camera = camera;
        this.bands = bands;
        this.fingerprintReader =fingerprintReader;
        this.storage = storage;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camera='" + camera + '\'' +
                ", bands='" + bands + '\'' +
                ", fingerprintReader=" + fingerprintReader +
                ", storage='" + storage + '\'' +
                ", ram='" + ram + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", bluetooth=" + bluetooth +
                ", screenSize=" + screenSize +
                ", price=" + price +
                '}';
    }
}
