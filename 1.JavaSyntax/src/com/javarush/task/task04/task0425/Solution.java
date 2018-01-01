package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in)); int a = Integer.parseInt(r.readLine()), b = Integer.parseInt(r.readLine()), i = 1;// номер четверти
         if (a < 0 & b >0) i = 2; if (a < 0 & b < 0) i = 3; if (a > 0 & b < 0) i = 4; System.out.println(i);
    }
}
