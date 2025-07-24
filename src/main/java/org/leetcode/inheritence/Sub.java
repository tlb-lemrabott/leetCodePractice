package org.leetcode.inheritence;

import java.time.Instant;

public class Sub extends Super{
    private Instant instantTime;
    public Sub(){
        super();
        System.out.println("Sub constructor is called");
        instantTime = Instant.now();
    }
    public void overrideMe(){
        System.out.println("overrideMe in Sub Class");
    }

    public static void main(String[] args) {
        new Sub();
    }


}
