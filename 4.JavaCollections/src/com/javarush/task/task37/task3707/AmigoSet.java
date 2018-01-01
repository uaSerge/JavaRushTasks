package com.javarush.task.task37.task3707;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * Created by Serge on 30.12.2017.
 */
public class AmigoSet <E> extends AbstractSet  implements Set, Cloneable,Serializable{
    private static final Object PRESENT = new Object();
    private transient HashMap <E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16,(int)Math.ceil(collection.size()/0.75f));
        this.map = new HashMap<>(capacity);
        for (E t: collection
             ) {
            map.put(t,PRESENT);
        }
    }

    @Override
    public boolean add(Object o) {
        return map.put((E)o,PRESENT) == null;
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == null;
    }

    @Override
    public Object clone()  {
        try {
            AmigoSet copy = (AmigoSet)super.clone();
            copy.map = (HashMap) map.clone();
            return copy;
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }

    public void writeObject(ObjectOutputStream obj){
        try {
            HashMapReflectionHelper helper = new HashMapReflectionHelper();

            obj.defaultWriteObject();
            obj.writeObject(map.keySet());

            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readObject(ObjectInputStream obj){
        try {
            obj.defaultReadObject();
            map = (HashMap<E, Object>) obj.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
