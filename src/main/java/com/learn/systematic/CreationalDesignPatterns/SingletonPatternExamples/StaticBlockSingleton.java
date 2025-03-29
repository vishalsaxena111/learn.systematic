package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class StaticBlockSingleton {
    // initially null
    private static StaticBlockSingleton instance;

    //  private constructor to prevent instantiation
    private StaticBlockSingleton(){}

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static synchronized StaticBlockSingleton getInstance(){
        return instance;
    }

}

// This is similar to eager initialization, but the instance is created in a static block.
//It provides the ability to handle exceptions during instance creation, which is not possible with simple eager initialization.

// It is thread safe but not lazy-loaded, which might be a drawback if the initialization is resource-intensive or time-consuming.