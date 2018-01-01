package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром — именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
‘,’=44, ‘s’=115, ‘t’=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.
*/

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream(args[0]);
            HashMap <Character,Integer> map = new HashMap();
            int i = 1;
            while (stream.available()>0){

                Character c =(char) stream.read();
                if (map.isEmpty()) {
                map.put(c,i);}
                else if (!map.containsKey(c)) {
                    map.put(c,i);
                } else if (map.containsKey(c)) {
                    int j = map.get(c);
                    map.put(c,++j);

                }
            }
            ArrayList <Character> list =new ArrayList();
            for (Character c : map.keySet()
                 ) {
                list.add(c);
            }
            Collections.sort(list);
            for (Character c: list
                 ) {
                System.out.println(c+" "+ map.get(c));
            }

        stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
