package com.javarush.task.task18.task1803;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
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
        HashMap <Integer, Integer> map = new HashMap();
        while (f.available()>0){
            num = f.read();
            int frequent = 0;
            if (!map.containsKey(num)) {
                map.put(num, ++frequent);

 //               System.out.println(num+ " "+ frequent);

            } else {
                frequent = map.get(num);
                frequent = ++frequent;
                map.put(num, frequent);

 //               System.out.println(num+ " "+ frequent);

            }

        }
 //       System.out.println();

        f.close();
        int max = 0;
        int num2 = 0;
        for (HashMap.Entry entry : map.entrySet()
             ) {
            if ((int)entry.getValue()>max){
            max = (int)entry.getValue();
            num2 = (int)entry.getKey();}

        }

        for (HashMap.Entry entry : map.entrySet()
             ) {
 //           System.out.println((int)entry.getKey() +" " + (int)entry.getValue()+" ");
            if ((int)entry.getValue()==(max))
            System.out.print(entry.getKey()+" ");

//            for (int i = 0; i < max-1;i++) {
//                System.out.print(num2+ " ");
//                i++;
//            }
        }

    }
}
