package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = buf.readLine();
            String file2 = buf.readLine();
            String file3 = buf.readLine();
            FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            FileInputStream fileInputStream3 = new FileInputStream(file3);
            while (fileInputStream2.available()>0) {
                fileOutputStream1.write(fileInputStream2.read());
            }
            while (fileInputStream3.available()>0) {
                fileOutputStream1.write(fileInputStream3.read());
            }
            buf.close();
            fileOutputStream1.close();
            fileInputStream2.close();
            fileInputStream3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
