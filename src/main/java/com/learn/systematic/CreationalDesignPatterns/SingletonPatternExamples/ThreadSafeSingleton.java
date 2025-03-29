package com.learn.systematic.CreationalDesignPatterns.SingletonPatternExamples;

public class ThreadSafeSingleton {
    // initially null
    private static ThreadSafeSingleton instance;

    //  private constructor to prevent instantiation
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }

}

// This approach is similar to lazy initialization but also ensures that the singleton is thread-safe.
// using synchronized ensuring only one thread can execute this method at a time.
// When a thread enters the synchronized method, it acquires a lock on the class object.
// Other threads must wait until the method is executed.

// --  But, using synchronized can decrease performance, which can be a bottleneck if called frequently.

