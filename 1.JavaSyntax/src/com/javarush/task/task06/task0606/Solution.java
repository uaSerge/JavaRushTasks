package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        String [] str = s.split("");
        int [] num = new int [str.length] ;

        for (int i  = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
            if (num[i]%2 == 0){
                even++;
            }
            else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd+"");
    }
}
