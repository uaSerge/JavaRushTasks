package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5); //Обязательно явно указать тип данных, иначе будет Object
        list.add(0, reader.readLine());
        int min=list.get(0).length();
        for (int i = 1; i < 5; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() < min)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем минимальные значения
                min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) //Берем и выводим все минимальные значения, даже если их несколько
                System.out.println(list.get(i));
        }
    }
}

