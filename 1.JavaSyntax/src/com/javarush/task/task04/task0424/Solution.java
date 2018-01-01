package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); String n1 = reader.readLine(); int a = Integer.parseInt(n1); String n2 = reader.readLine(); int b = Integer.parseInt(n2); String n3 = reader.readLine(); int c = Integer.parseInt(n3); if (a != b && a != c && b != c); else {if (a == b && (a != c && b != c)) System.out.println(3); else {if (a == c && (a != b && c!= b)) System.out.println(2); else {if (b == c && (b != a && c != a)) System.out.println(1);}}}

//        else if (b>a && a>c) System.out.println(a);
//        else if (c<a && c>b)System.out.println(c);
//        if (c>a && a>b) System.out.println(a);
//        else if (c<a && c>b) System.out.println(c);
//        else  if (a>b && b>c) System.out.println(b);
//        if (b>c && c>a) System.out.println(c);
//        else if (c>b && b>a) System.out.println(b);
//        else System.out.println(a);
    }
}
