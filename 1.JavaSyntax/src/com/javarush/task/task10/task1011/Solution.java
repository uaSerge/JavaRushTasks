package com.javarush.task.task10.task1011;

/* 
Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        ArrayList <Character> list = new ArrayList ();
        char [] str = s.toCharArray();
        for ( Character c : str
             ) {
            list.add(c);
        }
        for (int i = 0; i<40; i++){
            for (Character c : list) {
                System.out.print(c);
                }
            list.remove(0);
            System.out.println();
            }
        }
    }

