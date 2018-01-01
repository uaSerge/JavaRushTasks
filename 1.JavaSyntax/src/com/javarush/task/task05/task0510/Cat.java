package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name ;
    private int age ;
    private int weight;
    private String address ;
    private String color ;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
               this.color = "grey";
            }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;

        this.color = "grey";

    }
    public void initialize(int weight, String color) {
        this.color = color;
        this.weight = weight;
        this.age = 1;
            }

    public void initialize(int weight, String color, String address) {
        this.color = color;
        this.weight = weight;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
