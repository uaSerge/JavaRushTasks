package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
4. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
5. Метод main должен закрывать объект типа BufferedWriter после использования.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String file = "file";
        try {
             file = buf.readLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String s = "";
            while (!s.equals("exit")) {
                 s = buf.readLine();
                bw.write(s);
                bw.write(System.lineSeparator());
                            }
            buf.close();
            bw.close();
        } catch (Exception e ) { e.printStackTrace();}
        finally {

        }

       }
}
