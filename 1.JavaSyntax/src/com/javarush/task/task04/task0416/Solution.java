package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); double time = Double.parseDouble(reader.readLine()); double loop = time % 5;
        if(loop >= 0.0 && loop < 3.0) System.out.println("зелёный"); else if(loop >= 3.0 && loop < 4.0) System.out.println("желтый"); else System.out.println("красный");
    }
}