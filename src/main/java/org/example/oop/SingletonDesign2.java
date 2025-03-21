package org.example.oop;

public class SingletonDesign2 {
    private static SingletonDesign2 instance = null;
    private SingletonDesign2(){};
    public static SingletonDesign2 getInstance(){
        if(instance == null) {
            instance = new SingletonDesign2();
        }
        return instance;
    }
}
