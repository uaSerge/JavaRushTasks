package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Обязательно явно указать тип данных, иначе будет Object


        String min1 = null;
        String max1 = null;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() > max)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем максимальные значения
                max = list.get(i).length();
        }
 //       System.out.println(max);
        int min = max;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем минимальные значения
                min = list.get(i).length();
        }
//        System.out.println(min);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                min1 = list.get(i);
            break;} }
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).length() == max) {
                max1 = list.get(i);
                break;}

        if (list.indexOf(min1)<list.indexOf(max1)) System.out.println(min1);
        else System.out.println(max1);
    }
}
