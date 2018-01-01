package com.javarush.task.task16.task1632;
/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить «InterruptedException» при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить «Ура«;
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово «N«, а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new t1());
        threads.add(new t2());
        threads.add(new t3());
        threads.add(new t4());
        threads.add(new t5());
    }

    public static void main(String[] args) {

    }

    public static class t1 extends Thread {
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class t2 extends Thread {
        @Override
        public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        }
    }
    public static class t3 extends Thread {
        @Override
        public void run() {
            try {
                while (true){

                    System.out.println("Ура");
                    Thread.currentThread().sleep(500);
                }
            }catch (Exception e) {e.printStackTrace();}

        }
    }
    public static class t4 extends Thread implements Message{
        @Override
        public void run() {

        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class t5 extends Thread {
        @Override
        public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int k = 0;
        try {
            String n = br.readLine();
            while (!n.equals("N")) {
                i = Integer.parseInt(n);
                k=k+i;
                n = br.readLine();
            }
            System.out.println(k);
        }catch (Exception e) {e.printStackTrace();}
        }
    }

}