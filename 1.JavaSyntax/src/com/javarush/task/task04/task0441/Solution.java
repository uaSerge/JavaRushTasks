package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); int a, b, c; a = Integer.parseInt(reader.readLine()); b = Integer.parseInt(reader.readLine()); c = Integer.parseInt(reader.readLine()); int max = Math.max(a, Math.max(b, c)); int min = Math.min(a, Math.min(b, c)); int count = a+b+c-min-max; System.out.println(count);
    }
}
