package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class LazyInitializationSingleton {

    // create null object
    private static LazyInitializationSingleton instance;

    // private constructor no one can access it
    private LazyInitializationSingleton(){

    }

    // getInstance Method
    public static LazyInitializationSingleton getInstance(){
        // check null
        if(instance==null){
            // crete instance;
            instance = new LazyInitializationSingleton();
        }
        // if not null then return;
        return instance;
    }
}


//****  This approach creates the singleton instance only when it is needed,
// saving resources if the singleton is never used in the application.

// --This implementation is not thread-safe. If multiple threads call getInstance() simultaneously when instance is null,
// --it's possible to create multiple instances.
