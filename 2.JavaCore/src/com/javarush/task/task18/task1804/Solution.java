package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        String file = buf.readLine();
        buf.close();
        FileInputStream f = new FileInputStream(file);

        int num;
        HashMap<Integer, Integer> map = new HashMap();
        while (f.available()>0){
            num = f.read();
            int frequent = 0;
            if (!map.containsKey(num)) {
                map.put(num, ++frequent);
            } else {
                frequent = map.get(num);
                frequent = ++frequent;
                map.put(num, frequent);
            }

        }
        f.close();
        int min = Integer.MAX_VALUE;
        int num2 = 0;
        for (HashMap.Entry entry : map.entrySet()
                ) {
            if ((int)entry.getValue()<min){
                min = (int)entry.getValue();
                num2 = (int)entry.getKey();}

        }

        for (HashMap.Entry entry : map.entrySet()
                ) {
            if ((int)entry.getValue()==(min))
                System.out.print(entry.getKey()+" ");

        }

    }
}