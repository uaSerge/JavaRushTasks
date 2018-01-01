package com.javarush.task.task04.task0414;

/* 
Количество дней в году throws Exception
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year%4 != 0) ) {System.out.println("количество дней в году: "+365);}
        else if ((year%4 == 0) && (year%100!= 0) ){ System.out.println("количество дней в году: "+366);}
        else if ((year%400)==0){
            System.out.println("количество дней в году: "+366);
            }
        else System.out.println("количество дней в году: "+365);
    }
}