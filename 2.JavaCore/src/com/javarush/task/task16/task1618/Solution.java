package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread t = new TestThread();
        t.start();
        System.out.println("WW");
        t.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run() {
    while (true) {
        System.out.println("qq");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {e.printStackTrace();
        stop();}

    }

        }
    }
}