package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
    HashSet <Integer> set = new HashSet<>();
    set.add(11);
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);

        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        set.add(9);
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(14);

        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
    return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        HashSet rSet = new HashSet<>();
        for (Integer i : set) {
            if (i <= 10) rSet.add(i);
        }
        return rSet;

    }

    public static void main(String[] args) {
//        HashSet <Integer> set = createSet();
//        removeAllNumbersMoreThan10(set);
//        for (Integer i: set
//             ) {
//            System.out.println(i);
//
//        }
    }
}
