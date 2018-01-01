package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String [10];
        int [] nums = new int [10];
        for (int i = 0; i<strings.length; i++) {
            strings [i] = sc.readLine();

        }
        for (int i = 0; i<strings.length; i++) {

            nums [i] = strings[i].length();
        }
        for (int i: nums
             ) {
            System.out.println(i);

        }
    }
}
