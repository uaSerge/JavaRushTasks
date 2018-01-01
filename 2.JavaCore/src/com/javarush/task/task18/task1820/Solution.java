package com.javarush.task.task18.task1820;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String filename1 = cin.readLine();
            String filename2 = cin.readLine();
            FileInputStream fin = new FileInputStream(filename1);
            FileOutputStream fout = new FileOutputStream(filename2);
            StringBuilder str = new StringBuilder();
            while (fin.available() > 0) {
                str.append(Character.toChars(fin.read()));
            }
            String[] numbers = str.toString().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                int digit = Math.round(Float.parseFloat(numbers[i]));
                fout.write(Integer.toString(digit).getBytes());
                fout.write(32);
            }
            fin.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}