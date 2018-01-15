package com.javarush.task.task33.task3310.strategy;

import java.util.HashMap;
import java.util.Map;

public class OurHashBiMapStorageStrategy implements StorageStrategy {

    private HashMap<Long, String> k2v = new HashMap<>();
    private HashMap<String, Long> v2k = new HashMap<>();

    @Override
    public boolean containsKey(Long key) {
        return k2v.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return v2k.containsKey(value);
    }

    @Override
    public void put(Long key, String value) {
        k2v.put(key,value);
        v2k.put(value,key);
    }

    @Override
    public Long getKey(String value) {
//        for (Map.Entry e: k2v.entrySet()
//                ) {
//            if (e.getValue().equals(value)) return (Long) e.getKey();
//        }
        return v2k.get(value);
    }

    @Override
    public String getValue(Long key) {
        return k2v.get(key);
    }
}
