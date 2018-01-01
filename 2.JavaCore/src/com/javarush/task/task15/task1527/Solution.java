package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = b.readLine();
            String [] s1 = s.split("\\?");
            String [] s2 = s1[1].split("&");
            for (String str: s2) {
                String[] str2 = str.split("=");
                System.out.print(str2[0]+" ");
            }

            for (String str: s2) {
                String[] str2 = str.split("=");
                if (str2[0].contains("obj")) {
                    try {
                        System.out.println();
                        alert(Double.valueOf(str2[1]));
                    } catch (Exception e){ alert(str2[1]);}

                }
            }

        }catch (Exception e) {e.printStackTrace();}


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
