package com.javarush.task.task38.task3803;

/*
Runtime исключения (unchecked exception)
Напиши реализацию метода methodThrowsClassCastException(). Он должен всегда кидать Runtime исключение ClassCastException.

Напиши реализацию метода methodThrowsNullPointerException(). Он должен всегда кидать Runtime исключение NullPointerException.

Кинуть исключение (throw) явно нельзя.


Требования:
1. Метод methodThrowsClassCastException класса veryComplexClass не должен использовать ключевое слово throw.
2. Метод methodThrowsNullPointerException класса veryComplexClass не должен использовать ключевое слово throw.
3. Метод methodThrowsClassCastException класса veryComplexClass должен бросать исключение ClassCastException.
4. Метод methodThrowsNullPointerException класса veryComplexClass должен бросать исключение NullPointerException.
*/

import java.util.Map;
import java.util.TreeMap;

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Map map = new TreeMap();
        map.put(1,2);
        map.put("njk",3);
    }

    public void methodThrowsNullPointerException() {
        Map map = new TreeMap();
        String s = null;
        map.put(s,s);
    }

    public static void main(String[] args) {
        new VeryComplexClass().methodThrowsClassCastException();
        new VeryComplexClass().methodThrowsNullPointerException();
    }
}
