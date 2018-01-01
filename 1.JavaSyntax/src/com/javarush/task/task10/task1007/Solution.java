package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567
long l = (byte)111_1111_111_110L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x — (float)m;
l = (long) f / 1000;
*/

public class Solution {
    public static void main(String[] args) {
        long l = (long) 111_1111_111_110L; //-58
        int x = (int) 0b1000_1100_1010; //54
        double m = (double) 110_987_654_6299.123_34; // -1
        float f = (long) l++ + 10 + ++x - (float) m; // -100
        l = (long) f / 1000; // 0
        System.out.println(l);
    }
}