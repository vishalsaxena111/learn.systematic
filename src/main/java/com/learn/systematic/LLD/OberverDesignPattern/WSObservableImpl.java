package com.learn.systematic.LLD.OberverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WeatherObservableInterface{

    List<DisplayObserverInterface> observerList = new ArrayList<>();
    int temp =0;

    @Override
    public void add(DisplayObserverInterface obj) {
        observerList.add(obj);
    }

    @Override
    public void remove(DisplayObserverInterface obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for(DisplayObserverInterface obj : observerList){
            obj.update();
        }

    }

    @Override
    public void setTemp(int t) {

        if(t!=temp) {
            temp = t;
            notifyObserver();
        }
    }

    @Override
    public int getData() {
        return temp;
    }
}
