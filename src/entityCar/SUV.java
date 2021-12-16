package entityCar;

public abstract class SUV {
    public abstract String getSUVName();
    public abstract String getSUVFeatures();
    @Override
    public String toString(){
        return "SUVName= "+this.getSUVName()+", SUVFeatures="+this.getSUVFeatures()+",";
    }
}
