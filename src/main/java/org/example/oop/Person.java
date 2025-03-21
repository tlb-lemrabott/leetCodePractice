package org.example.oop;

import java.util.*;

public class Person implements Comparable<Person>, Comparator<Person> {
    int age = 10;
    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o){
        if(o == null || getClass() != o.getClass()) return false;
        if(this == o) return true;
        Person personO = (Person) o;
        return this.age == personO.age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(25));
        people.add(new Person(30));
        people.add(new Person(20));

        Collections.sort(people, (p1, p2) -> Integer.compare(p1.age, p2.age));
        people.forEach(p -> System.out.println(p.age));
    }
}
