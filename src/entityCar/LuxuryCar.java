package entityCar;

public class LuxuryCar extends Car {
    private String name;
    public LuxuryCar(String cName) {
        name = cName;
    }
    public String getCarName() {
        return name;
    }
    public String getCarFeatures() {
        return "Luxury Car Features ";
    };


}
