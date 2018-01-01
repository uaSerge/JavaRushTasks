package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap <String, Integer> map = new HashMap <> ();
        for (int i=0; i<10; i++) {
            map.put("Name"+i,480+(i*10));
            }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap <String,Integer> copy = new HashMap<>(map);
        for (Map.Entry pair: copy.entrySet()) {
            if ((int)pair.getValue()<500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}