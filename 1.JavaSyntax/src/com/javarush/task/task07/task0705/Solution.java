package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [20];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int [] nums1 = new int [10];
        int [] nums2 = new int [10];

        for (int i = 0; i<10; i++) {
            nums1 [i] = nums[i];
        }
        for (int i = 0; i<10; i++) {
            nums2 [i] = nums[i+10];
        }
        for (int i :nums2
                ) {
            System.out.println(i);

        } }
}
