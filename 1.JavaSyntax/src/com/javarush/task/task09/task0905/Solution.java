package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
аписать метод, который возвращает результат – глубину его стек-трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement [] staсk = Thread.currentThread().getStackTrace();
        int deep = staсk.length;
        System.out.println(deep);
        return deep;
    }
}

