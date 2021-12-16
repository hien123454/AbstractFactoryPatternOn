package entityCar;

public class NonLuxurySUV extends SUV {
    private String name;
    public NonLuxurySUV(String sName) {
        name = sName;
    }
    public String getSUVName() {
        return name;
    }
    public String getSUVFeatures() {
        return "Non-Luxury SUV Features ";
    };


}
