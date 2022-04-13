package com.company;

import com.company.components.*;

public class Car extends Vehicle{

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        super(carType, seats, engine, transmission, tripComputer, gpsNavigator);

        if(getTripComputer() != null){
            getTripComputer().setCar(this);
        }

    }



    @Override
    public CarType getCarType() {
        return super.getCarType();
    }

    @Override
    public int getSeats() {
        return super.getSeats();
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public Transmission getTransmission() {
        return super.getTransmission();
    }

    @Override
    public TripComputer getTripComputer() {
        return super.getTripComputer();
    }

    @Override
    public GPSNavigator getGpsNavigator() {
        return super.getGpsNavigator();
    }
}
