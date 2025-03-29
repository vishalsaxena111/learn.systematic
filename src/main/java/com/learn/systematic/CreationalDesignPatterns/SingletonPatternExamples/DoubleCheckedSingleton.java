package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){

        if(instance==null){

            synchronized (DoubleCheckedSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckedSingleton();
                }
            }

        }

        return instance;

    }
}


// This approach minimizes performance overhead from synchronization by only synchronizing when the object is first created.
//It uses the volatile keyword to ensure that changes to the instance variable are immediately visible to other threads.

//-- Although this method is a bit complex to implement, it can drastically reduce the performance overhead.