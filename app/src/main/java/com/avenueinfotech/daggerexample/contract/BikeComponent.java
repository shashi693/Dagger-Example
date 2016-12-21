package com.avenueinfotech.daggerexample.contract;

/**
 * Created by suken on 20-12-2016.
 */

import android.content.SharedPreferences;

import com.avenueinfotech.daggerexample.domain.Bike;
import com.avenueinfotech.daggerexample.module.BikeModule;
import com.avenueinfotech.daggerexample.scope.PreActivity;

import dagger.Component;
import dagger.Module;

/**
 * Created by suken on 08-12-2016.
 */
@Module
@PreActivity
@Component(
        dependencies = {
                ApplicationComponent.class
        },
        modules = {
                BikeModule.class
        }
)
public interface BikeComponent {
    public void inject( Bike bike);

    Bike providerBike();
    SharedPreferences providePreferences();
}