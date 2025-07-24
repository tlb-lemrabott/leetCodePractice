package org.leetcode.oop;
public class FruitFactoryInterface {
    public static Fruit getFruitObjectByName(String name){
        if(name.equalsIgnoreCase("Apple")){
            return new Apple();
        }else if (name.equalsIgnoreCase("Banana")){
            return new Banana();
        }
        return null;
    }
}
interface Fruit{
    public void getFruitInformation();
}
class Apple implements Fruit{
    @Override
    public void getFruitInformation() {
        System.out.println("This is an apple fruit contains 70% of water");
    }
}
class Banana implements Fruit{
    @Override
    public void getFruitInformation() {
        System.out.println("This is a banana fruit contains 30% of water");
    }
}
class MainClass{
    public static void main(String[] args) {
        Fruit fruit = FruitFactoryInterface.getFruitObjectByName("Apple");
        fruit.getFruitInformation();
    }
}


