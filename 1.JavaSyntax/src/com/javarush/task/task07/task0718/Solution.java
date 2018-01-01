package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        for (int i= 0; i<10; i++) list.add(sc.readLine());
        int i = 0;
        String iter = null;
        for (String str : list
             ) {
            if (i != 0)
            if (str.length()<iter.length()){ System.out.println(i);break;}
            iter = str;
            i++;
        }
        }
       }


