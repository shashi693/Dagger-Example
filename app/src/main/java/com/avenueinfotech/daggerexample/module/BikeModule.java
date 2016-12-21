package com.avenueinfotech.daggerexample.module;

import com.avenueinfotech.daggerexample.domain.Bike;
import com.avenueinfotech.daggerexample.domain.Engine;
import com.avenueinfotech.daggerexample.scope.PreActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by suken on 08-12-2016.
 */

@Module
public class BikeModule {
    @Provides
    @PreActivity
    public Engine provideEngine(){
        return( new Engine() );
    }

    @Provides
    @PreActivity
    public Bike provideBike(  ){

        return( new Bike(  ) );
    }
}
