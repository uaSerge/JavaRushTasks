package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в
возрастающем порядке по имени.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            TreeMap<String,Double> map = new TreeMap();
            while (fileReader.ready()){
                String string = fileReader.readLine();
                String [] strings= string.split("\\s");
                String name = strings[0];
                Double salary = Double.parseDouble(strings[1]);
                if (!map.containsKey(name)) {
                    map.put(name,salary);
                } else {
                    Double salaryNew = map.get(name)+salary;
                    map.put(name,salaryNew);
                }
            }
            for (Map.Entry entry: map.entrySet()
                 ) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
