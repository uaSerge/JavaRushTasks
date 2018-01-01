package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        try {
            String file = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();
            bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            while (bufferedReader.ready()){
                String s = bufferedReader.readLine();
                String[] array = s.split("\\s");
                for (int i = 0; i < array.length; i++){
                    if (array[i].matches("[+-]?\\d+")){
                        writer.write(array[i]+" ");
                    }
                }
            }

            bufferedReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
