package com.avenueinfotech.daggerexample.module;

import com.avenueinfotech.daggerexample.domain.Car;
import com.avenueinfotech.daggerexample.domain.Engine;
import com.avenueinfotech.daggerexample.scope.PreActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by suken on 08-12-2016.
 */

@Module
public class CarModule {
    @Provides
    @PreActivity
    public Engine provideEngine(){
       return( new Engine() );
    }

    @Provides
    @PreActivity
    public Car provideCar(  ){

        return( new Car(  ) );
    }
}
