package com.learn.systematic.LLD.OberverDesignPattern;

public interface WeatherObservableInterface {

    public void add(DisplayObserverInterface obj);

    public void remove(DisplayObserverInterface obj);

    public void notifyObserver();

    public void setTemp(int t);

    public int getData();
}
