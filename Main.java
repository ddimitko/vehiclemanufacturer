package com.company;

import com.company.builders.CarBuilder;
import com.company.builders.CarManualBuilder;

public class Main {

    public static void main(String[] args) throws Exception{

        Director sportscar = new Director();

        CarBuilder carBuilder = new CarBuilder();

        sportscar.constructCityCar(carBuilder);

        Car sports = carBuilder.build();

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        sportscar.constructSportsCar(carManualBuilder);

        Manual carManual = carManualBuilder.build();

        System.out.println(sports.getCarType());
        System.out.println(carManual.toString());

    }
}
