package com.avenueinfotech.daggerexample.domain;

/**
 * Created by suken on 20-12-2016.
 */

import javax.inject.Inject;


public class Bike {

    public static final String SPEED = "com.avenueinfotech.daggerexample.domain.Bike.SPEED";

    @Inject
    Engine engine;

    @Inject
    public Bike(){
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
