package Singleton;

import java.io.Serializable;

//  Solution1:if object is there -> throw exception from inside constructor
public class SingletonBreakSolution implements Serializable,Cloneable {

    private static SingletonBreakSolution obj;

    private SingletonBreakSolution() {
        if (obj != null) {
            throw new RuntimeException("Trying to break Singleton");
        }
    }

    public static SingletonBreakSolution getObj() {
        if (obj == null) {
            synchronized (SingletonBreakSolution.class) {
                if (obj == null) {
                    obj = new SingletonBreakSolution();
                }
            }
        }
        return obj;
    }

//  Solution to avoid breaking Singleton Pattern by Deserialization
    public Object readResolve() {
        return obj;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
//  Breaking Singleton Pattern by Cloning
//        return super.clone();
//  solution to avoid breaking Singleton Pattern by Cloning
        return obj;
    }
}

/*
//   Solution2: use enum
public enum SingletonBreakSolution{
    Instance, instance;

    public void Test(){
        System.out.println("This is a test method");
    }*/

