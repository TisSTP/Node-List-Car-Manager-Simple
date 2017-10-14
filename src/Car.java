public class Car {

    String brand;
    String model;
    String engine;
    int power;
    int price;
    String doors;
    String seats;
    String colour;

    public void  setCarSpecs(String brand, String model, String engine, int power, int price, String doors, String seats, String colour) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.power = power;
        this.price = price;
        this.doors = doors;
        this.seats = seats;
        this.colour = colour;
    }

    @Override
    public String toString() {
        String str;
        str = "brand: " + brand + "\n";
        str = str + "model: " + model + "\n";
        str = str + "engine: " + engine + "\n";
        str = str + "power: " + power + "\n";
        str = str + "price: " + price + "\n";
        str = str + "seats: " + seats + "\n";
        str = str + "colour: " + colour + "\n";

        return str;
    }


}
