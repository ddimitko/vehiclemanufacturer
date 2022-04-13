package com.company.builders;

import com.company.Manual;
import com.company.components.*;
import com.company.interfaces.Builder;

public class CarManualBuilder implements Builder<Manual> {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGpsNavigator(GPSNavigator gpsNavigator) {

        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public Manual build() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }


}
