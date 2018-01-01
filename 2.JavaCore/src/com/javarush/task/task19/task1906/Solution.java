package com.javarush.task.task19.task1906;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным индексом.

Пример:
второй символ, четвертый символ, шестой символ и т.д.

Закрыть потоки ввода-вывод
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();
            FileReader reader = new FileReader(file1);
            FileWriter writer = new FileWriter(file2);
            int i = 0;
            while (reader.ready()){
                int c = reader.read();
                i++;
                if (i%2==0) {
                    writer.write(c);
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
