package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
Считать с консоли 2 имени файла — file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
В оригинальном и редактируемом файлах пустых строк нет.
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String file1 = buf.readLine();
            String file2 = buf.readLine();
            buf.close();
            FileReader reader1 = new FileReader(file1);
            FileReader reader2 = new FileReader(file2);
            BufferedReader sc1 = new BufferedReader(reader1);
            BufferedReader sc2 = new BufferedReader(reader2);
            String string1 = sc1.readLine();
            String string2 = sc2.readLine();
            String string11 = string1;
            String string22 = string2;
            while (!string1.isEmpty() || !(string2.isEmpty())) {

                if (string1.equals(string2)) {
                    lines.add(new LineItem(Type.SAME, string1));
                    if (!sc1.ready() && !sc2.ready()) break;
                    string1 = sc1.readLine();
                    string2 = sc2.readLine();
                    string11 = string1;
                    string22 = string2;
                } else {
                    if (sc1.ready()) {
                        try {
                            string1 = sc1.readLine();
                        } catch (NullPointerException e) {
                            string1 = "";
                        }
                    }
                    if ((string1.equals(string2))) {
                        lines.add(new LineItem(Type.REMOVED, string11));
                    } else {
                        lines.add(new LineItem(Type.ADDED, string2));
                        lines.add(new LineItem(Type.SAME, string11));

                        string2 = sc2.readLine();
                        string2 = sc2.readLine();
                    }
                }

            if (!sc1.ready() || !sc2.ready()) {
                if (!sc1.ready() && !sc2.ready()) {
                    if (string1.equals(string2)){
                        lines.add(new LineItem(Type.SAME, string1));}
                    else if (!string1.isEmpty()) lines.add(new LineItem(Type.REMOVED, string1));
                    else  {lines.add(new LineItem(Type.ADDED, string2)); break;}
                    }

                    if (string1.equals(string2) && sc1.ready()){
                        lines.add(new LineItem(Type.SAME, string1));
                     if (!string1.isEmpty() && sc1.ready()) {
                         string1 = sc1.readLine();
                        lines.add(new LineItem(Type.REMOVED, string1));
                        while (sc1.ready() || !string1.isEmpty()) {
                            if (!string1.isEmpty()) break;
                            string1 = sc1.readLine();
                            lines.add(new LineItem(Type.REMOVED, string1));
                        }}
                        break;
                    }
                    if (string1.equals(string2) && sc2.ready()){
                        lines.add(new LineItem(Type.SAME, string1));
                        if (!string2.isEmpty() && sc2.ready()) {
                            string2 = sc2.readLine();
                        lines.add(new LineItem(Type.ADDED, string2));
                        while (sc2.ready() || !string2.isEmpty()) {
                            if (!string2.isEmpty()) break;
                            string2 = sc2.readLine();
                            lines.add(new LineItem(Type.ADDED, string2));
                        }}
                        break;
                    }
                    break;
                }
            }

            reader1.close();
            reader2.close();
            sc1.close();
            sc2.close();
//            for (LineItem l: lines
//                 ) {
//                System.out.println( l.type+ " "+l.line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
