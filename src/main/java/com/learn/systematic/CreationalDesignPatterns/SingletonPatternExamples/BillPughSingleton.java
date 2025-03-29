package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class BillPughSingleton {

    private BillPughSingleton(){

    }

    // static inner class that holds the instance
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}


//   uses a static inner helper class to hold the singleton instance. The inner class is not loaded into memory until it's referenced for the first time in the getInstance() method.
//It is thread-safe without requiring explicit synchronization.

