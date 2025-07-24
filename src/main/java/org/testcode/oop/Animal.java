package org.testcode.oop;

public interface Animal extends AnimalParent{
    public void getSound();
    public static void makeSound(){
        System.out.println("From interface");
    }
}
