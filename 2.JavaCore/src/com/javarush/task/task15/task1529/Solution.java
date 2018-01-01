package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = b.readLine();
            if (s.equals("helicopter")) result = new Helicopter();
            if (s.equals("plane")) {
                int i = Integer.parseInt(b.readLine());
                result = new Plane(i);
            }
        }catch (Exception e){e.printStackTrace();}
    }
}
