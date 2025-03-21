package org.example.oop.inheritnace;

import org.example.inheritence.Super;

public class SuperMain {
    public SuperMain() {
    }

    static int a =10;


    public static void main(String[] args) {
        SuperMain sm = new SubMain();
        SubMain.a = 30;
        SubMain.b = 60;
        System.out.println(a);
        System.out.println(SubMain.b);
        new SuperMain().a = 10;

        System.out.println(a);
    }
}



