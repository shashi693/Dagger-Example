package com.avenueinfotech.daggerexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.avenueinfotech.daggerexample.contract.ApplicationComponent;
import com.avenueinfotech.daggerexample.contract.BikeComponent;
import com.avenueinfotech.daggerexample.contract.CarComponent;
import com.avenueinfotech.daggerexample.contract.DaggerBikeComponent;
import com.avenueinfotech.daggerexample.contract.DaggerCarComponent;
import com.avenueinfotech.daggerexample.domain.Bike;
import com.avenueinfotech.daggerexample.domain.Car;
import com.avenueinfotech.daggerexample.module.BikeModule;
import com.avenueinfotech.daggerexample.module.CarModule;

public class MainActivity extends AppCompatActivity {

    private CarComponent mCarComponent;
    private Car mCar;
    private BikeComponent mBikeComponent;
    private Bike mBike;
    private SharedPreferences mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mCarComponent = DaggerCarComponent
                .builder()
                .applicationComponent( getApplicationComponent())
                .carModule( new CarModule())
                .build();



        mCar = mCarComponent.providerCar();

        mCarComponent.inject( mCar );

        mCar.increaseSpeed(60);
        Toast.makeText(this, "Car: "+mCar.getSpeed(), Toast.LENGTH_SHORT).show();


        mSharedPreferences = mCarComponent.providePreferences();
        mSharedPreferences.edit().putInt(Car.SPEED, mCar.getSpeed()).apply();
        Toast.makeText(this, "SharedPreferences: "+ mSharedPreferences.getInt(Car.SPEED, 0), Toast.LENGTH_LONG).show();

        mBikeComponent = DaggerBikeComponent
                .builder()
                .applicationComponent( getApplicationComponent())
                .bikeModule( new BikeModule())
                .build();



        mBike = mBikeComponent.providerBike();

        mBikeComponent.inject( mBike );

        mBike.increaseSpeed(90);
        Toast.makeText(this, "Bike: "+mBike.getSpeed(), Toast.LENGTH_SHORT).show();


        mSharedPreferences = mBikeComponent.providePreferences();
        mSharedPreferences.edit().putInt(Bike.SPEED, mBike.getSpeed()).apply();
        Toast.makeText(this, "SharedPreferences: "+ mSharedPreferences.getInt(Bike.SPEED, 0), Toast.LENGTH_LONG).show();
    }

    private ApplicationComponent getApplicationComponent(){
        return(((AndroidApplication) getApplication()).getApplicationComponent());
    }
}
