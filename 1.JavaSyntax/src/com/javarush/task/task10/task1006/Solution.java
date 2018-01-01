package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
short b = (short) 45;
char c = (short)‘c’;
short s = (short)1005.22;
int i = (short)150000;
float f =(short)4.10f;
double d = (short)1.256d;
double result = (f * b) + (i / c) — (d * s) + 562.78d;
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45;// 45 +
        char c = (short) 'c'; // 99 +
        short s = (short) 1005.22;// 1005 +
        int i = (int) 150000; // 18928
        float f = (float) 4.10f;// 4
        double d = (double) 1.256d;// 1 +
        double result = (f * b) + (i / c) - (d * s) + 562.78d; //-71.22
        System.out.println("result: " + result);
    }
}