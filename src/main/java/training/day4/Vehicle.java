package training.day4;

public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    double fuelConsumption;
    double fuel;
    int horsePower;

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public void drive(double kilometers) {

        int traveledKilometers = 0;
        while (fuel > DEFAULT_FUEL_CONSUMPTION*kilometers) {
            kilometers--;
            fuel -= DEFAULT_FUEL_CONSUMPTION;
            traveledKilometers++;
        }
        System.out.println("The car traveled " + traveledKilometers + " kilometers");
    }
}
