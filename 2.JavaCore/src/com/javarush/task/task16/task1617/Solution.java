package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для countSeconds=4 :
«4 3 2 1 Прервано!»

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 :
«3 2 1 Марш!»

PS: метод sleep выбрасывает InterruptedException.
*/

import java.util.Date;

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {

            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
            Date d = new Date();
            long date = d.getTime();
            System.out.print(countSeconds+" ");
            while (true){
                Thread.currentThread().sleep(1000);
            countSeconds--;
                long date2 = new Date().getTime();

                System.out.print(countSeconds+" ");
            long df = date2-date;
            if (df>3500) {
                System.out.print("Прервано!");break;
            }
            if (countSeconds==1) {
                Thread.currentThread().sleep(1000);
                System.out.println("Марш!");
            }
                if (countSeconds<=1) break;}
        }catch (Exception e){
                System.out.print("Прервано!");}
        }
    }
}
