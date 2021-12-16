package entityCar;

public class NonLuxuryCar extends Car {
    private String name;
    public NonLuxuryCar(String cName) {
        name = cName;
    }
    public String getCarName() {
        return name;
    }
    public String getCarFeatures() {
        return "Non-Luxury Car Features ";
    };


}
