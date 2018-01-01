package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int eur = 100;
        double course= 1.1;
        System.out.println(convertEurToUsd(eur,course));
        eur = 200;
        course = 1.2;
        System.out.println(convertEurToUsd(eur,course));

    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
      double doll = eur*course;
      return doll;
    }
}
