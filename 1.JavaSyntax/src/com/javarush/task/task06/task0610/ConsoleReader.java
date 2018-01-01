package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
                return s;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        Integer i = sc.nextInt();
        return i;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        Double d = sc.nextDouble();
        return d;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        Boolean b = sc.nextBoolean();
        return b;

    }

    public static void main(String[] args) {

    }
}
