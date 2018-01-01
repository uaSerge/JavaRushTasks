package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> list = new ArrayList<>();
        int [] f = {1,2,3,4,5};
        int [] f2 = {1,2};
        int [] f3 = {1,2,3,4};
        int [] f4 = {1,2,3,4,5,6,7};
        int [] f5 = {};
        list.add(f);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
