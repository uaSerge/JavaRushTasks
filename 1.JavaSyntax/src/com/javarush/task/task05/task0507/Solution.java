package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution  {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double a = 0;
        double i = 0;
        double c;
        while ( true) {

            int b= sc.nextInt();
            if (b == -1) { c= a / i ; break;}
            a =  a+ b;
            i++;
            }
        System.out.println(c);
    }
}

