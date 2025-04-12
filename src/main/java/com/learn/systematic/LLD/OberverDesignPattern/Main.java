package com.learn.systematic.LLD.OberverDesignPattern;

public class Main {

    public static void main(String[] args) {

        WSObservableImpl obj = new WSObservableImpl();
        MobileDisplayImpl mbl = new MobileDisplayImpl(obj);
        TVDisplayObserverImpl tv = new TVDisplayObserverImpl(obj);

        obj.add(mbl);
        obj.add(tv);

        obj.setTemp(12);
        obj.setTemp(14);


    }
}
