package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String name2 = sc.next();
        if (name.equals(name2)){
            System.out.println("Имена идентичны");
        }
        else if (name.length()==name2.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
