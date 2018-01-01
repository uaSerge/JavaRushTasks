package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
    HashMap <String,String> map = new HashMap<>();
    map.put("qq","aa");
        map.put("qq123","aa");
        map.put("qq1","aa");
        map.put("qq2","aa");
        map.put("qq3","aa");

        map.put("qq4","aa");
        map.put("qq5","aa");
        map.put("qq6","aa");
        map.put("qq7","aa");
        map.put("qq8","aa");


        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) count++; }
            return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        return 1;
    }

    public static void main(String[] args) {

    }
}
