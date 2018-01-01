package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Обязательно явно указать тип данных, иначе будет Object
        int max = 0;
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() > max)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем максимальные значения
                max = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) //Берем и выводим все максимальные значения, даже если их несколько
                System.out.println(list.get(i));
        }
    }
}




