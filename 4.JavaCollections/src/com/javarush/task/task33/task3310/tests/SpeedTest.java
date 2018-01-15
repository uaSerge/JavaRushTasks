package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Helper;
import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.Solution;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SpeedTest {
    public long getTimeForGettingIds(Shortener shortener, Set<String> strings, Set<Long> ids){
        long l = new Date().getTime();
        ids = Solution.getIds(shortener,strings);
        long l2 = new Date().getTime();
        return l2-l;
    }

    public long getTimeForGettingStrings(Shortener shortener, Set<Long> ids, Set<String> strings){
        long l = new Date().getTime();
        strings = Solution.getStrings(shortener,ids);
        long l2 = new Date().getTime();
        return l2-l;
    }
    @Test
    public void testHashMapStorage(){
        Shortener shortener1 = new Shortener(new HashMapStorageStrategy());
        Shortener shortener2 = new Shortener(new HashBiMapStorageStrategy());
        Set <String> origStrings = new HashSet<>();
        for (int i = 0; i<10000; i++){
            String s = Helper.generateRandomString();
            origStrings.add(s);
        }
        Set <Long> ids = new HashSet<>();
        long l = getTimeForGettingIds(shortener1,origStrings,ids);
        long l2 = getTimeForGettingIds(shortener2,origStrings,ids);
        Assert.assertNotEquals(l,l2);

        l = getTimeForGettingStrings(shortener1,ids,origStrings);
        l2 = getTimeForGettingStrings(shortener2,ids,origStrings);
        Assert.assertEquals(l,l2,30);

    }
}
