package com.avenueinfotech.daggerexample;

import android.app.Application;

import com.avenueinfotech.daggerexample.contract.ApplicationComponent;
import com.avenueinfotech.daggerexample.contract.DaggerApplicationComponent;
import com.avenueinfotech.daggerexample.module.ApplicationModule;

/**
 * Created by suken on 08-12-2016.
 */

public class AndroidApplication extends Application {
    private ApplicationComponent mApplicationComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent
                                .builder()
                                .applicationModule(new ApplicationModule( this ))
                                .build();

//        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule( this)).build();

    }

    public ApplicationComponent getApplicationComponent(){
        return ( mApplicationComponent );
    }
}
