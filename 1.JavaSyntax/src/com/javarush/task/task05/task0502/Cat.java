package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean fight = false;
        if (this.strength>anotherCat.strength) fight=true;
        else if (this.strength==anotherCat.strength && this.weight>anotherCat.weight) fight =true;
        else if (this.strength==anotherCat.strength && this.weight==anotherCat.weight&& this.age<anotherCat.age)fight = true;
        return fight;
    }

    public static void main(String[] args) {

    }
}
