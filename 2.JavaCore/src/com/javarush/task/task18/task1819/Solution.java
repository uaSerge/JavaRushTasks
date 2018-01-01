package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;

        try {
            file1 = buf.readLine();
            file2 = buf.readLine();
            FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
            FileInputStream fileInputStream1 = new FileInputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2);

           byte[] buffer = new byte[fileInputStream1.available()];
            int cap = 0;
            while (fileInputStream1.available()>0) {
                cap = fileInputStream1.read(buffer);

            }
//            File myFile = new File(file1);
//            if (myFile.exists()) {
//                myFile.delete();
//                myFile.createNewFile(new File(file1));
//            }
            while (fileInputStream2.available()>0) {
                fileOutputStream1.write(fileInputStream2.read());
            }
            fileOutputStream1 = new FileOutputStream(file1,true);
            fileOutputStream1.write(buffer);
            fileOutputStream1.close();
            fileInputStream2.close();
            fileInputStream1.close();
            buf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
