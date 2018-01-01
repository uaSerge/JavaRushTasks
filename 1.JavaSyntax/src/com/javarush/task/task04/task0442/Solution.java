package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int c = 0;

        while (a != -1) {
            a=sc.nextInt();
            c=c + a;
        }

        System.out.println(c);
    }
}
