package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Меня зовут "+name +".");
        System.out.println("Я родился "+d +"."+m +"."+y);

    }
}
