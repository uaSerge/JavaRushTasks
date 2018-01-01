package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b = 0;
        int c = 0;
        while (a.equals("сумма")==false) {
            b = Integer.parseInt(a);
            c = b+c;
            a = sc.next();
        }
        System.out.println(c);
    }
}
