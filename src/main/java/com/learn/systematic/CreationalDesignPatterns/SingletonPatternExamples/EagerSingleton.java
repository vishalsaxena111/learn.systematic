package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return  instance;
    }

}

//we rely on the JVM to create the singleton instance when the class is loaded. The JVM guarantees that the instance will be created before any thread access the instance variable.
//This implementation is one of the simplest and inherently thread-safe without needing explicit synchronization.

// -- While it is inherently thread-safe, it could potentially waste resources if the singleton instance is never used by the client application.
