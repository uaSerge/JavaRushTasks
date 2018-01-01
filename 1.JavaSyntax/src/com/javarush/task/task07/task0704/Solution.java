package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [10];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int [] nums1 = new int [10];
        for (int i = 0; i<10; i++) {
            nums1 [nums1.length-1-i] = nums[i];
        }
        for (int i :nums1
             ) {
            System.out.println(i);

        }
    }
}

