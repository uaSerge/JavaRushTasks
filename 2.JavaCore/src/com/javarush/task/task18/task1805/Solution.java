package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений — отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(bufferedReader.readLine());
        TreeSet <Integer> set = new TreeSet();
        while (stream.available()>0){
            set.add(stream.read());
        }
        for (Integer i: set
             ) {
            System.out.print(i+" ");
        }
        bufferedReader.close();
        stream.close();
    }
}
