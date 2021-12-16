package test;

import FactoryCar.VehicleFactory;
import entityCar.Car;
import entityCar.SUV;

public class AutoSearchUI {
    public static void main(String[] args) {
        VehicleFactory vf = VehicleFactory.getVehicleFactory("Luxury");
        VehicleFactory vf2 = VehicleFactory.getVehicleFactory("Non-Luxury");
        Car car1 = vf.getCar();
        Car car2 = vf2.getCar();
        SUV suv1 = vf.getSUV();
        SUV suv2 = vf2.getSUV();
        System.out.println("AbstractFactory Car Config::"+car1);
        System.out.println("AbstractFactory Car Config::"+car2);
        System.out.println("AbstractFactory SUV Config::"+suv1);
        System.out.println("AbstractFactory SUV Config::"+suv2);
    }
}
