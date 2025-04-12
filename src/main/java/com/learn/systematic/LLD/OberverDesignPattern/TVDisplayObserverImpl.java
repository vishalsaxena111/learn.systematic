package com.learn.systematic.LLD.OberverDesignPattern;

public class TVDisplayObserverImpl implements DisplayObserverInterface{

    WeatherObservableInterface obj;

    TVDisplayObserverImpl(WeatherObservableInterface obj){
        this.obj = obj;
    }

    @Override
    public void update() {
        System.out.println("update in Tv display"+ this.obj.getData());
    }
}
