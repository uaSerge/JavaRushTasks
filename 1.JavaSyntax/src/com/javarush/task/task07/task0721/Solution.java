package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int [] mass = new int[20];
        for (int i = 0; i <20; i++) {
            mass [i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mass);
        minimum = mass [0];
        maximum = mass [19];

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
