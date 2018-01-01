package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader1);
        String file = "";
        try {
            file = br.readLine();
            br.close();
            inputStreamReader1.close();
            FileInputStream f = new FileInputStream(file);
            InputStreamReader inputStreamReader2 = new InputStreamReader(f);
            br = new BufferedReader(inputStreamReader2);
            String c;
            Integer k;
            ArrayList <Integer> list = new ArrayList<> ();
            while (br.ready()) {c=br.readLine();
                k = Integer.parseInt(c);
                list.add(k);
                }
            f.close();
            inputStreamReader2.close();
            br.close();
            Collections.sort(list);
            for (Integer i: list
                 ) {
            if (i%2==0) {
                System.out.println(i);
            } }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

         }
}
