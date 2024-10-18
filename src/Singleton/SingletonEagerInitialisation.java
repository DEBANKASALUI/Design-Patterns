package Singleton;

public class SingletonEagerInitialisation {

    //  Eager Initialisation: Eager way of creating objects
    private static SingletonEagerInitialisation singletonEagerObject = new SingletonEagerInitialisation();

    private SingletonEagerInitialisation() {
    }

    public static SingletonEagerInitialisation getSingletonEagerObject() {
        return singletonEagerObject;
    }
}

/*1. Making constructor private.
2. Create object with the help of static method(getSingletonEagerObject()).
3. Create a private static field to store the object(singletonEagerObject).*/
