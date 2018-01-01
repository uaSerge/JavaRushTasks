package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
*/

import java.io.FileInputStream;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
    String file = args[0];
    float probel = 0;
    float vse = 0;
    int c = 0;
        try {
            FileInputStream stream = new FileInputStream(file);
            while (stream.available()>0){
                c = stream.read();
                if (c == 32) probel++;
                vse++;
            }
            float pr = probel/vse*100;
            System.out.println(String.format(new Locale("ru"),"%(.2f",pr));
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
