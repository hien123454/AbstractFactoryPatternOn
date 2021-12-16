package entityCar;

public class LuxurySUV extends SUV {
    private String name;
    public LuxurySUV(String sName) {
        name = sName;
    }
    public String getSUVName() {
        return name;
    }
    public String getSUVFeatures() {
        return "Luxury SUV Features ";
    };


}
