package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> cats = new HashMap<>();
        cats.put("Asia",new Cat("Asia"));
        cats.put("Asia1",new Cat("Asia1"));
        cats.put("Asia2",new Cat("Asia2"));
        cats.put("Asia3",new Cat("Asia3"));
        cats.put("Asia4",new Cat("Asia4"));
        cats.put("Asia5",new Cat("Asia5"));
        cats.put("Asia6",new Cat("Asia6"));
        cats.put("Asia7",new Cat("Asia7"));
        cats.put("Asia8",new Cat("Asia8"));
        cats.put("Asia9",new Cat("Asia9"));
        return  cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set <Cat> setCat = new HashSet<>();
        for (Map.Entry entry: map.entrySet()) {
            setCat.add((Cat) entry.getValue());
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
