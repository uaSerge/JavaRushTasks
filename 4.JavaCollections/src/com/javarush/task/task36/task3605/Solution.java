package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Использование TreeSet
Первым параметром приходит имя файла: файл1.
файл1 содержит только буквы латинского алфавита, пробелы, знаки препинания, тире, символы перевода каретки.
Отсортируй буквы по алфавиту и выведи на экран первые 5 различных букв в одну строку без разделителей.
Если файл1 содержит менее 5 различных букв, то выведи их все.
Буквы различного регистра считаются одинаковыми.
Регистр выводимых букв не влияет на результат.
Закрой потоки.

Пример 1 данных входного файла:
zBk yaz b-kN

Пример 1 вывода:
abkny

Пример 2 данных входного файла:
caAC
A, aB? bB

Пример 2 вывода:
abc

Подсказка: использовать TreeSet


Требования:
1. Программа должна использовать класс TreeSet.
2. У объекта типа TreeSet вызови метод add для добавления элементов.
3. Программа должна выводить результат на экран.
4. Вывод программы должен соответствовать условию задачи.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(file));

//        String arg = reader.readLine().toLowerCase();
//        char [] chars = arg.toCharArray();
        String ex = "";
        TreeSet treeSet = new TreeSet();
        while (reader.ready()) {
            char c = (char) reader.read();
                String s = (c + "").toLowerCase();
                if (s.matches("[A-Za-z]"))
                    treeSet.add((String) s);
        }
//        Collections.sort(list);
        reader.close();
        if (treeSet.size()>4){
            for (int i = 0; i<5;i++){
                String c = (String)treeSet.pollFirst();
                System.out.print(c);
                treeSet.remove(c);
            }
        }  else {
            for (int i = treeSet.size()-1;i>=0;i--){
                String c = (String)treeSet.first();
                System.out.print(c);
                treeSet.remove(c);
            }
        }
    }
}
