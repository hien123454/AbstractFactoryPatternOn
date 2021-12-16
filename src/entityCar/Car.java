package entityCar;

public abstract class Car {
    public abstract String getCarName();
    public abstract String getCarFeatures();
    @Override
    public String toString(){
        return "CarName= "+this.getCarName()+", CarFeatures="+this.getCarFeatures()+",";
    }
}
