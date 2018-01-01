package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово «exit«.
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String — это имя файла, параметр Integer — это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String e = "exit";
        try {
            String name = buf.readLine();
            while (!name.equals(e)){
                ReadThread thread = new ReadThread(name);
                thread.start();
                name = buf.readLine();
            }
        buf.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
       private FileInputStream  f ;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                f = new FileInputStream(fileName);
                int num;
                HashMap <Integer, Integer> map = new HashMap();
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
                int max = 0;
                int num2 = 0;
                for (HashMap.Entry entry : map.entrySet()
                        ) {
                    if ((int)entry.getValue()>max){
                        max = (int)entry.getValue();
                        num2 = (int)entry.getKey();}
                }
                resultMap.put(fileName,num2);

            } catch (Exception e) {
                e.printStackTrace();
                try {
                    f.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
