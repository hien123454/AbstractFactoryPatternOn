package FactoryCar;

import entityCar.Car;
import entityCar.LuxuryCar;
import entityCar.LuxurySUV;
import entityCar.SUV;

public class LuxuryVehicleFactory extends VehicleFactory {
    public Car getCar() {
        return new LuxuryCar("L-C");
    }
    public SUV getSUV() {
        return new LuxurySUV("L-S");
    }
}
