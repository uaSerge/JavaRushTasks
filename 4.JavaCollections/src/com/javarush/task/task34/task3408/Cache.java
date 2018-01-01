package com.javarush.task.task34.task3408;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        //TODO add your code here
        V v = null;
        if (cache.get(key) == null){
            Class[] paramTypes = new Class[] { key.getClass() };
            Constructor aConstruct = clazz.getConstructor(paramTypes);
            v = (V) aConstruct.newInstance(key);
            cache.put(key, v);
        } else v = cache.get(key);
        return v;
    }

    public boolean put(V obj) {
        //TODO add your code here
        Class v = obj.getClass();
        Method method = null;
        try {
            method= v.getDeclaredMethod("getKey", null);
            method.setAccessible(true);
            K k = (K) method.invoke(obj);
            cache.put(k,obj);
            return cache.containsKey(k);
        } catch (NoSuchMethodException e) {
            return false;
        } catch (IllegalAccessException e) {
            return  false;
        } catch (InvocationTargetException e) {
            return false;
        }
    }

    public int size() {
        return cache.size();
    }
}
