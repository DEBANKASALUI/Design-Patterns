package Singleton;

public class SingletonLazyInitialisation {

    private static SingletonLazyInitialisation singletonObject;

    //  constructor private
    private SingletonLazyInitialisation() {
    }

    //   Lazy Initialisation: Lazy way of creating singleton object:not thread safe
    public static SingletonLazyInitialisation getSingletonObject() {
//   Object of this class
        if (singletonObject == null) {
            singletonObject = new SingletonLazyInitialisation();
        }
        return singletonObject;
    }

    //  Lazy Initialisation: Lazy way of creating singleton object: thread safe & synchronised
    public static SingletonLazyInitialisation getSynchronisedSingletonObject() {
//   Object of this class
        if (singletonObject == null) {
            synchronized (SingletonLazyInitialisation.class) {
                if (singletonObject == null) {
                    singletonObject = new SingletonLazyInitialisation();
                }
            }
        }
        return singletonObject;
    }

}

/*1. Making constructor private.
2. Create object with the help of static method(getSingletonObject()).
3. Create a private static field to store the object(singletonObject).*/
