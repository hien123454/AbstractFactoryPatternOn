package FactoryCar;

import entityCar.Car;
import entityCar.NonLuxuryCar;
import entityCar.NonLuxurySUV;
import entityCar.SUV;

public class NonLuxuryVehicleFactory extends VehicleFactory {
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }
    public SUV getSUV() {
        return new NonLuxurySUV("NL-S");
    }
}
