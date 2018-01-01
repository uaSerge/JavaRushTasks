package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        int a= x2-x1;
        int b= y2-y1;
        double c = Math.sqrt(a * a + b * b);
        return c;
    }

    public static void main(String[] args) {

    }
}
