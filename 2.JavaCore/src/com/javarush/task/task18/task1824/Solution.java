package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        FileInputStream input = null;
        for (; true; ) {
            file = reader.readLine();
            try {
                input = new FileInputStream(file);
                input.close();
            } catch (FileNotFoundException fne) {
                System.out.println(file);
                break;
            }
        }
    }
}