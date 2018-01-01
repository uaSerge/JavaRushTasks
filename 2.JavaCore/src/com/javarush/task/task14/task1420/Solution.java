package com.javarush.task.task14.task1420;

/*
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(buf.readLine());
            int b = Integer.parseInt(buf.readLine());
            if (a<=0||b<=0) throw new Exception();
            int max = 0;
            for (int i = 1; i < (a < b ? a : b) + 1; i++) {
                if((a%i == 0) && (b%i == 0)) max = i;
            }
//            while (a != b) {
//                if (a > b) a = a - b;
//                else b = b - a; }
            System.out.println(max);
        } catch (Exception e) { throw e;}
    }
}
