package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    ArrayList <Integer> list = new ArrayList();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int x = 1, y = 0;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (i != 0) {
                if (list.get(i).equals(list.get(i-1))) {
                    x++;
                    if (x > y) y = x;
                } else x = 1;
            } }
            System.out.println(y);
        }

    }
