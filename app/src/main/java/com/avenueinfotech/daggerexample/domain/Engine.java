package com.avenueinfotech.daggerexample.domain;

/**
 * Created by suken on 08-12-2016.
 */
public class Engine {
    private int rpm;

    public Engine(){
        this.rpm = 0;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }



}
