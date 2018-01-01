package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

  //      System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method5() {
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }
}
