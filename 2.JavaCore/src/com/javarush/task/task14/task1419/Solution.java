package com.javarush.task.task14.task1419;


import java.util.*;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
            String s = "";

        }
        catch (Exception e) {exceptions.add(new ArithmeticException());
            exceptions.add(new NullPointerException());
            exceptions.add(new NoSuchElementException ());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new IllegalStateException());
            exceptions.add(new SecurityException());
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}
