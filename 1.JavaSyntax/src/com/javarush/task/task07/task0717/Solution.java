package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<10; i++) list.add(sc.next());

        ArrayList<String> result = doubleValues(list);
        for (String str : result
             ) {
            System.out.println(str);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList <String> listN = new ArrayList<>();
        for (String str: list
             ) { listN.add(str);
            listN.add(str);
        }
        return listN;
    }
}
