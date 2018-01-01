package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat { //напишите тут ваш код
     private String name, address, color;
     private int age, weight;

     public Cat(String name)
    { this.name = name;
    this.address = null;
    this.color = "white";
    this.age = 2;
    this.weight = 3; }

    public Cat(String name, int weight, int age)
    { this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = "white";
    this.address = null; }

    public Cat(String name, int age) {
         this.name = name;
         this.age = age;
         this.weight = 2;
         this.color = "white";
         this.address = null; }

         public Cat(int weight, String color) {
         this.weight = weight;
         this.color = color;
         this.name = null;
         this.address = null;
         this.age = 3; }

         public Cat(int weight, String color, String address) {
         this.weight = weight;
         this.color = color;
         this.address = address;
             this.age = 3;
         this.name = null;
         }
    public static void main(String[] args) {

    }
}
