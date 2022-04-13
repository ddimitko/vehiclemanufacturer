package com.company;

import com.company.components.*;
import com.company.interfaces.Builder;

public class Director {

    public void constructCityCar(Builder builder){

        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1499));
        builder.setSeats(4);
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());

    }

    public void constructSportsCar(Builder builder){

        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(4500));
        builder.setSeats(2);
        builder.setTransmission(Transmission.SEMIAUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());

    }

    public void constructSUVCar(Builder builder){

        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(3700));
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());

    }

}
