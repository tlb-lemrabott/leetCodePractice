package org.example.oop;

class Main {

    public static void main(String[] args) {
        String msg = SingletonDesign.getInstance().displayMessage("Hello Word");
        System.out.println(msg);
    }

}