package com.javarush.task.task33.task3310.tests;

import com.javarush.task.task33.task3310.Shortener;
import com.javarush.task.task33.task3310.strategy.DualHashBidiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.FileStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashBiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.OurHashBiMapStorageStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;
import java.security.SecureRandom;

public class FunctionalTest {

    public void testStorage(Shortener shortener){
        String string1  = new BigInteger(130, new SecureRandom()).toString(32);
        String string2 = new BigInteger(130, new SecureRandom()).toString(32);
        String string3 = string1.toString();
        Long long1 = shortener.getId(string1);
        Long long2 = shortener.getId(string2);
        Long long3 = shortener.getId(string3);
        Assert.assertNotEquals(long2,long1);
        Assert.assertEquals(long1,long3);
        String str1 = shortener.getString(long1);
        String str2 = shortener.getString(long2);
        String str3 = shortener.getString(long3);

        Assert.assertEquals(string1,str1);
        Assert.assertEquals(string2,str2);
        Assert.assertEquals(string3,str3);
    }

    @Test
    public void testHashMapStorageStrategy(){
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashMapStorageStrategy(){
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void  testFileStorageStrategy(){
        Shortener shortener = new Shortener(new FileStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void  testHashBiMapStorageStrategy(){
        Shortener shortener = new Shortener(new HashBiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void  testDualHashBidiMapStorageStrategy(){
        Shortener shortener = new Shortener(new DualHashBidiMapStorageStrategy());
        testStorage(shortener);
    }

    @Test
    public void testOurHashBiMapStorageStrategy(){
        Shortener shortener = new Shortener(new OurHashBiMapStorageStrategy());
        testStorage(shortener);
    }
}
