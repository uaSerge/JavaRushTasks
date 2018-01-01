package com.javarush.task.task19.task1914;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов — нет.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byt = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byt);
        System.setOut(stream);
        testString.printSomething();
        String out = byt.toString();
        String[] result = out.split(" ");
        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[2]);
        int z = 0;
        switch (result[1]) {
            case "+": z = x + y; break;
            case "-": z = x - y; break;
            case "*": z = x * y; break;
        }
        System.setOut(consoleStream);

        System.out.print(x + " " + result[1] + " " + y + " = " + z);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

