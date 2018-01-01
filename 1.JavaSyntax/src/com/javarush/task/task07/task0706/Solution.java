package com.javarush.task.task07.task0706;

import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [15];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int even = 0;
        int i = 0;
        while ( i < nums.length) {
            even = even + nums[i];
            i=i+2;
        }
        int odd = 0;
        i = 1;
        while ( i < nums.length) {
            odd = odd + nums[i];
            i=i+2;
        }
        if (even>odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println( "В домах с нечетными номерами проживает больше жителей.");
    }
}
