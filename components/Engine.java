package com.company.components;

import com.company.interfaces.Motion;

public class Engine implements Motion {

    private int size;
    private double mileage;
    private Boolean started;

    public Engine(int size) {
        this.size = size;
    }

    @Override
    public void go(double mileage) throws Exception {

        if(started){
            this.mileage += mileage;
        }
        else{
            throw new Exception("Engine not running!");
        }

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }
}
