package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
//        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i< 50000000; i++) {
            Cat cat = new Cat();
//            cats.add(cat);
        }
 //       ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i< 50000000; i++) {
            Dog dog = new Dog();
 //           dogs.add(dog);
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}
