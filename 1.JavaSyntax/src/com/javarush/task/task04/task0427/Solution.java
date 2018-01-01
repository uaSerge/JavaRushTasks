package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0 && num<10) { if (num%2==0)System.out.println("четное однозначное число");else System.out.println("нечетное однозначное число");}
        else if (num>9 && num<21) { if (num%2==0)System.out.println("четное двузначное число");else System.out.println("нечетное двузначное число");}
        else if (num>9 && num<100) { if (num%2==0)System.out.println("четное двузначное число");else System.out.println("нечетное двузначное число");}
        else if (num>99 && num<1000) { if (num%2==0)System.out.println("четное трехзначное число");else System.out.println("нечетное трехзначное число");}
    }
}
