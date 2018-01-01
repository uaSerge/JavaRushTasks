package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> map = new HashMap <String, String>();
        map.put("Stallone", "QQ");
        map.put("Stallone1", "WW");
        map.put("Stallone2", "RR");
        map.put("Stallone3", "AA");
        map.put("Stallone4", "ZZ");
        map.put("Stallone5", "DD");
        map.put("Stallone6", "FF");
        map.put("Stallone7", "CC");
        map.put("Stallone8", "CC");
        map.put("Stallone9", "CC");
    return  map;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry <String, String> pair: copy.entrySet()) {
            if ((Collections.frequency(map.values(), pair.getValue())) > 1)
                Solution.removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap <String, String> (map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//      HashMap <String,String> map =  Solution.createMap();
//      Solution.removeTheFirstNameDuplicates(map);
//        for (Map.Entry <String,String> pair : map.entrySet()
//             ) {
//            System.out.println(pair.getKey() + " " +pair.getValue());
//        }
    }
}
