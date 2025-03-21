package org.example.oop;

public class SingletonDesign {
    private static SingletonDesign instance = null;
    private SingletonDesign() {}
    public static SingletonDesign getInstance(){
        if(instance == null){
            instance = new SingletonDesign();
        }
        return instance;
    }
    public static String displayMessage(String msg){
        return msg;
    }
}
