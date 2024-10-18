package Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMain {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

//      not Thread Safe
        System.out.println("Singleton Pattern Lazy Initialisation Thread unsafe: ");
        SingletonLazyInitialisation obj1 = SingletonLazyInitialisation.getSingletonObject();
        System.out.println("obj1: " + obj1.hashCode());
        SingletonLazyInitialisation obj2 = SingletonLazyInitialisation.getSingletonObject();
        System.out.println("obj2: " + obj2.hashCode());
//  hashcode same means single object is used multiple times and no new object is created

/*  eager initialisation means already initialised as soon as the class is loaded because of static member,
  remains unused if not required by client*/
        System.out.println("Singleton Pattern Eager Initialisation: ");
        SingletonEagerInitialisation obj3 = SingletonEagerInitialisation.getSingletonEagerObject();
        System.out.println("obj3: " + obj3.hashCode());
        SingletonEagerInitialisation obj4 = SingletonEagerInitialisation.getSingletonEagerObject();
        System.out.println("obj4: " + obj4.hashCode());

//      ThreadSafe
        System.out.println("Singleton Pattern Lazy Initialisation Thread safe: ");
        SingletonLazyInitialisation obj5 = SingletonLazyInitialisation.getSynchronisedSingletonObject();
        System.out.println("obj5: " + obj5.hashCode());
        SingletonLazyInitialisation obj6 = SingletonLazyInitialisation.getSynchronisedSingletonObject();
        System.out.println("obj6: " + obj6.hashCode());


//      1. Reflection API to break Singleton Design Pattern
        System.out.println("Breaking Singleton pattern using Reflection API: ");
        SingletonLazyInitialisation s1 = SingletonLazyInitialisation.getSingletonObject();
        System.out.println("s1 " + s1.hashCode());

        Constructor<SingletonLazyInitialisation> constructor = SingletonLazyInitialisation.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonLazyInitialisation s2 = constructor.newInstance();
        System.out.println("s2 " + s2.hashCode());

        /* Solutions to avoid above breaking Singleton Pattern:
        1 - if object exists -> throw exception from inside constructor
        2 - use enum */

      /*  System.out.println("Solution 1 to avoid breaking Singleton Pattern: ");
        SingletonBreakSolution sb1 = SingletonBreakSolution.getObj();
        System.out.println("sb1 " + sb1.hashCode());

        Constructor<SingletonBreakSolution> constructorsb = SingletonBreakSolution.class.getDeclaredConstructor();
        constructorsb.setAccessible(true);
        SingletonBreakSolution sb2 = constructorsb.newInstance();
        System.out.println("s2 " + sb2.hashCode());*/

       /* System.out.println("Solution 2 to avoid breaking Singleton Pattern: ");
        SingletonBreakSolution sb1 = SingletonBreakSolution.instance;
        System.out.println("sb1 " + sb1.hashCode());
        sb1.Test();
        Constructor<SingletonBreakSolution> constructorsb = SingletonBreakSolution.class.getDeclaredConstructor();
        constructorsb.setAccessible(true);
        SingletonBreakSolution sb2 = constructorsb.newInstance();
        System.out.println("s2 " + sb2.hashCode());*/

//     2. Deserialization to break Singleton Design Pattern
        System.out.println("Breaking Singleton pattern using Deserialization: ");
        SingletonBreakSolution sb3 = SingletonBreakSolution.getObj();
        System.out.println("sb3: " + sb3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(sb3);

        System.out.println("Serialization done....");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        SingletonBreakSolution sb4 = (SingletonBreakSolution) ois.readObject();
        System.out.println("sb4: " + sb4.hashCode());

        System.out.println("Solution to avoid breaking Singleton Pattern: ");
//      Solution to avoid above breaking Singleton Pattern:
//      implement readResolve() method in parent class and return obj
        System.out.println("sb4: " + sb4.hashCode());

//      3. Object Cloning by clone() method to break Singleton Design Pattern
        System.out.println("Breaking Singleton pattern using Cloning: ");
        SingletonBreakSolution sb5 = SingletonBreakSolution.getObj();
        System.out.println("sb5: " + sb5.hashCode());

        SingletonBreakSolution sb6 = (SingletonBreakSolution) sb5.clone();
        System.out.println("sb6: " + sb6.hashCode());
//      Solution to avoid above breaking Singleton Pattern:
//      override clone() method in parent class and return obj

    }
}
