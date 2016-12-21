package com.avenueinfotech.daggerexample.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by suken on 08-12-2016.
 */
@Module
public class ApplicationModule {
    private static final String PREF_KEY = "pk";
    private Application app;
    public ApplicationModule( Application a){
        this.app = a;
    }

    @Provides
    @Singleton
    public SharedPreferences providePreferences(  ){
        return ( this.app.getSharedPreferences(PREF_KEY, Context.MODE_PRIVATE));
    }
}
