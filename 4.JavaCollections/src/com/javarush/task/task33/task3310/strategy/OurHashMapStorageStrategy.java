package com.javarush.task.task33.task3310.strategy;

public class OurHashMapStorageStrategy implements StorageStrategy{

//    static final int DEFAULT_INITIAL_CAPACITY = 16;
//    static final float DEFAULT_LOAD_FACTOR = 0.75f;
//    Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];
//    int size;
//    int threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
//    float loadFactor = DEFAULT_LOAD_FACTOR;
//
//    public int hash(Long k){
//            int h;
//            return (k == null) ? 0 : (h = k.hashCode()) ^ (h >>> 16);
//        }
//
//    public int indexFor(int hash, int length){
//            return hash & (length-1);
//    }
//
//    final Entry getEntry(Long key) {
//        int hash = (key == null) ? 0 : hash(key);
//        for (Entry e = table[indexFor(hash, table.length)];
//             e != null;
//             e = e.next) {
//            Object k;
//            if (e.hash == hash &&
//                    ((k = e.key) == key || (key != null && key.equals(k))))
//                return e;
//        }
//        return null;
//    }
//
//    public void resize(int newCapacity) {
//        Entry[] oldTable = table;
//        int oldCapacity = oldTable.length;
//        if (oldCapacity == 1 << 30) {
//            threshold = Integer.MAX_VALUE;
//            return;
//        }
//    }
//
//    public void transfer(Entry [] newTable){
//            Entry[] src = table;
//            int newCapacity = newTable.length;
//            for (int j = 0; j < src.length; j++) {
//                Entry e = src[j];
//                if (e != null) {
//                    src[j] = null;
//                    do {
//                        Entry next = e.next;
//                        int i = indexFor(e.hash, newCapacity);
//                        e.next = newTable[i];
//                        newTable[i] = e;
//                        e = next;
//                    } while (e != null);
//                }
//            }
//        }
//
//    public void addEntry(int hash, Long key, String value, int bucketIndex){
//            Entry e = table[bucketIndex];
//                table[bucketIndex] = new Entry(hash, key, value, e);
//                if (size++ >= threshold)
//                    resize(2 * table.length);
//            }
//
//    public void createEntry(int hash, Long key, String value, int bucketIndex){
//        Entry e = table[bucketIndex];
//        table[bucketIndex] = new Entry(hash, key, value, e);
//        size++;
//    }
//
//    @Override
//    public boolean containsKey(Long key) {
//        return getEntry(key) != null;
//    }
//
//    @Override
//    public boolean containsValue(String value) {
//        if (value == null)
//            return false;
//        Entry[] tab = table;
//        for (int i = 0; i < tab.length ; i++)
//            for (Entry e = tab[i] ; e != null ; e = e.next)
//                if (value.equals(e.value))
//                    return true;
//        return false;
//    }
//
//    @Override
//    public void put(Long key, String value) {
////        if (key == null)
////            return putForNullKey(value);
//        int hash = hash(key);
//        int i = indexFor(hash, table.length);
//        for (Entry e = table[i]; e != null; e = e.next) {
//            Object k;
//            if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
//                String oldValue = e.value;
//                e.value = value;
////                e.recordAccess(this);
////                return oldValue;
//            }
//        }
//    }
//
//    @Override
////    public Long getKey(String value) {
////        for (Entry e : table
////             ) {
////            if (e.value.equals(value)) return e.key;
////        }
////        return null;
////    }
//    public Long getKey(String value) {
//        if (value == null)
//            return 0L;
//
//        for (Entry table : table) {
//            for (Entry e = table; e != null; e = e.next)
//                if (value.equals(e.value))
//                    return table.getKey();
//        }
//        return null;}
//    @Override
////    public String getValue(Long key) {
//////
//////        for (Entry e : table
//////                ) {
//////            if (e.key ==(key)) return e.value;
//////        }
//////        return null;
//////    }
//
//        public String getValue(Long key) {
//        return null == getEntry(key) ? null : getEntry(key).getValue();
//    }
static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final float DEFAULT_LOAD_FACTOR = 0.75f;
    Entry[] table = new Entry[DEFAULT_INITIAL_CAPACITY];
    int size;
    int threshold = (int) (DEFAULT_INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
    float loadFactor = DEFAULT_LOAD_FACTOR;


    @Override
    public boolean containsKey(Long key) {
        return getEntry(key) != null;
    }

    @Override
    public boolean containsValue(String value) {
        if (value == null)
            return false;
        for (Entry table : table) {
            for (Entry e = table; e != null; e = e.next)
                if (value.equals(e.value))
                    return true;
        }
        return false;
    }

    @Override
    public void put(Long key, String value) {
        addEntry(hash(key), key, value, indexFor(hash(key),table.length));
    }

    @Override
    public Long getKey(String value) {
        if (value == null)
            return 0L;

        for (Entry table : table) {
            for (Entry e = table; e != null; e = e.next)
                if (value.equals(e.value))
                    return table.getKey();
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return null == getEntry(key) ? null : getEntry(key).getValue();
    }


    public int hash(Long k) {
        return k.hashCode();
    }

    public int indexFor(int hash, int length) {
        return hash & (length-1);
    }

    public Entry getEntry(Long key) {
        if (size == 0)
            return null;

        int hash = (key == null) ? 0 : hash(key);
        for (Entry e = table[indexFor(hash, table.length)];
             e != null;
             e = e.next) {
            Object k;
            if (e.hash == hash &&
                    ((k = e.key) == key || (key != null && key.equals(k))))
                return e;
        }
        return null;

    }

    public void resize(int newCapacity) {
        Entry[] oldTable = table;
        int oldCapacity = oldTable.length;
        if (oldCapacity == (1 << 30)) {
            threshold = Integer.MAX_VALUE;
            return;
        }
        Entry[] newTable = new Entry[newCapacity];
        transfer(newTable);
        table = newTable;
        threshold = (int)Math.min(newCapacity * loadFactor, (1 << 30) + 1);
    }

    public void transfer(Entry[] newTable) {
        int newCapacity = newTable.length;
        for (Entry e : table) {
            while(null != e) {
                Entry next = e.next;
                int i = indexFor(e.hash, newCapacity);
                e.next = newTable[i];
                newTable[i] = e;
                e = next;
            }
        }
    }

    public void addEntry(int hash, Long key, String value, int bucketIndex) {
        if ((size >= threshold) && (null != table[bucketIndex])) {
            resize(2 * table.length);
            hash = (null != key) ? hash(key) : 0;
            bucketIndex = indexFor(hash, table.length);
        }
        createEntry(hash, key, value, bucketIndex);
    }

    public void createEntry(int hash, Long key, String value, int bucketIndex) {
        Entry e = table[bucketIndex];
        table[bucketIndex] = new Entry(hash, key, value, e);
        size++;
    }
}


