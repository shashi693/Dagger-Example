package com.avenueinfotech.daggerexample.contract;

import android.content.SharedPreferences;

import com.avenueinfotech.daggerexample.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by suken on 08-12-2016.
 */
@Module
@Singleton
@Component( modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
    SharedPreferences providePreferences();
}
