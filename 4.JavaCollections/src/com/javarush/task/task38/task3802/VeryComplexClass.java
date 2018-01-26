package com.javarush.task.task38.task3802;

/* 
Проверяемые исключения (checked exception)
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class VeryComplexClass {

    public void veryComplexMethod() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(new String()))));
    }

    public static void main(String[] args) throws Exception{
    new VeryComplexClass().veryComplexMethod();
    }
}
