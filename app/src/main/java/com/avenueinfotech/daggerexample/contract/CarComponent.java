package com.avenueinfotech.daggerexample.contract;

import android.content.SharedPreferences;

import com.avenueinfotech.daggerexample.domain.Car;
import com.avenueinfotech.daggerexample.module.CarModule;
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
                CarModule.class
        }
)
public interface CarComponent {
    public void inject( Car car);

    Car providerCar();
    SharedPreferences providePreferences();
}
