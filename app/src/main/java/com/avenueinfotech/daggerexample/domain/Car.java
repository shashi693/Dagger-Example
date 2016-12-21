package com.avenueinfotech.daggerexample.domain;

import javax.inject.Inject;

/**
 * Created by suken on 08-12-2016.
 */

public class Car {

    public static final String SPEED = "com.avenueinfotech.daggerexample.domain.Car.SPEED";

    @Inject Engine engine;

    @Inject
    public Car(){
//        this.engine = e;
    }

    public void  increaseSpeed(int value) { engine.accelerate(value);}

    public void stop(){
        engine.brake();
    }

    public int getSpeed(){
        return engine.getRpm();
    }
}
