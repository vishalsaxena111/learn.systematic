package com.learn.systematic.LLD.OberverDesignPattern;

public class MobileDisplayImpl implements DisplayObserverInterface{

    WeatherObservableInterface obj;

    MobileDisplayImpl(WeatherObservableInterface obj){
        this.obj = obj;
    }

    @Override
    public void update() {

        System.out.println("update in mobile display"+ this.obj.getData());

    }


}
