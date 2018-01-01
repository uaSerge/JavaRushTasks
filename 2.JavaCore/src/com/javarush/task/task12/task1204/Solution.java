package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String s = o.getClass().getSimpleName();
        switch (s){
            case ("Cat"):
                System.out.println("Кошка"); break;
            case ("Bird"):
                System.out.println("Птица"); break;
            case ("Lamp"):
                System.out.println("Лампа"); break;
            case ("Dog"):
                System.out.println("Собака"); break;
        }
 //       System.out.println(o.getClass().getSimpleName());
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
