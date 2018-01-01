package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        String [] strings = new String [10];
        for (int i = 0; i<8; i++) {
            strings [i] = sc.next();

        }
       for ( int n = strings.length-1; n>=0; n--) {
            System.out.println(strings[n]);

        }
    }
}