package com.javarush.task.task18.task1816;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        try {
            String name = args[0];
            FileInputStream stream = new FileInputStream( name);
            int i = 0;
            int c = 0;
            while (stream.available()>0) {
                c = stream.read();
                if (c >= 97 && c <= 122 || c >= 65 && c <= 90)
                    i++;
            }
            System.out.println(i);
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
