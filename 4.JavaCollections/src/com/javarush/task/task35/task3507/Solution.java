package com.javarush.task.task35.task3507;

import java.nio.file.FileStore;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/
public class Solution {
    public static void main(String[] args) {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) {
        Set <? extends Animal> set = new HashSet<>();
        Path path = Paths.get(pathToAnimals);
        Iterator<FileStore> iterator = path.getFileSystem().getFileStores().iterator();

        return set;
    }
}
