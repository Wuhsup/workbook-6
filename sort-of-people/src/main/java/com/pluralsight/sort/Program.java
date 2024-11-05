package com.pluralsight.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        Person p = new Person("Dad", "Young", 23);
        Person a = new Person("Mom", "Young", 22);
        Person b = new Person("Kayden", "Young", 3);
        Person d = new Person("Kataleya", "Palomares", 1);
        myFamily.add(p);
        myFamily.add(a);
        myFamily.add(b);
        myFamily.add(d);

        Collections.sort(myFamily);
        Collections.reverse(myFamily);

        for(Person h: myFamily) {
            System.out.println(h);
        }
    }
}

