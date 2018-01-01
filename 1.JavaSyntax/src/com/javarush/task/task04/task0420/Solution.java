package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int [] mass = new int[3];
        Scanner sc = new Scanner(System.in);
        mass [0] = sc.nextInt();
        mass [1] = sc.nextInt();
        mass [2] = sc.nextInt();
        Arrays.sort(mass);
        for (int i=mass.length-1; i>=0;i--) {
            System.out.print(mass[i]+" ");
        }
    }
}
