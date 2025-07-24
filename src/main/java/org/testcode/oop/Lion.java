package org.testcode.oop;

public class Lion implements Animal{
    @Override
    public void getSound(){
        System.out.println("Hooooo");
    }

    public void makeSound(){
        System.out.println("Making sound");
    }

}
