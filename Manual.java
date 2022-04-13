package com.company;

import com.company.components.*;

public class Manual extends Vehicle{

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        super(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    public String toString(){
        return getCarType() + " " + getEngine().getSize() + " " +
                getSeats() + " " + getTransmission() + " " +
                getTripComputer() + " " + getGpsNavigator();
    }

}
