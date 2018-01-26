package com.javarush.task.task19.task1926;

/* 
Перевертыши
1 Считать с консоли имя файла. Считать содержимое файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке.
2.2 вывести на экран.
3 Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while (bufferedReader.ready()){
                String rev = bufferedReader.readLine();
                StringBuffer stringBuffer = new StringBuffer(rev);
                System.out.println(stringBuffer.reverse());
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
