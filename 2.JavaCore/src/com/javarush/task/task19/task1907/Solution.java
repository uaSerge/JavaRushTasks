package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            bufferedReader.close();
   //         BufferedReader buff = new BufferedReader(new FileReader(file1));
            FileReader buff = new FileReader(file1);
            Pattern pattern = Pattern.compile("\\bworld\\b");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            int i = 0;
            while (buff.ready()){
                int c = buff.read();
                stringBuffer.append((char)c);
                }
            Matcher matcher = pattern.matcher(stringBuffer);
          while (matcher.find()){
                i++;
            }

            buff.close();
            System.out.println(i);


           } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

