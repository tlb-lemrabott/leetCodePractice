package org.example.inheritence;

public class Super {
    public Super(){
        System.out.println("Super constructor is called");
        overrideMe();
    }
    public void overrideMe(){
        System.out.println("overrideMe Super Class");
    }
}
