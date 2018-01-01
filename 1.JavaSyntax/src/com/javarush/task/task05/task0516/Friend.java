package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private char sex;

    public  Friend (String name) {
        this.name = name;
//        age = 1;
//        sex = 'w';
    }
    public  Friend (String name, int age) {
        this.name = name;
        this.age = age;
//        sex = 'w';
    }
    public  Friend (String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
