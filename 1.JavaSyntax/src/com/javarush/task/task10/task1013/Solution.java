package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;
        private Human child;

        public Human (String name, boolean sex, int age) {
            this(name,sex,age, new Human("nobody"));

        }

        public Human (String name) {
            this(name, true);
                  }
            public Human (String name, boolean sex) {
                this(name,sex,18);
            }
        public Human (String name, boolean sex, int age,Human father) {
            this( name,  sex,  age,  father, new Human("some"));
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this( name,  sex,  age,  father, mother,new Human("some"));
        }
        public Human (String name, boolean sex, int age, Human father, Human mother, Human child) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        public Human (String name, int age, Human father, Human mother, Human child) {
            this.name = name;
            this.sex = true;
            this.age = age;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        public Human (boolean sex, Human father, Human mother, Human child) {
            this.name = "Stranger";
            this.sex = sex;
            this.age = 0;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        public Human (Human father, Human mother, Human child) {
            this.name = "Stranger";
            this.sex = true;
            this.age = 50;
            this.father = father;
            this.mother = mother;
            this.child = child;
        }
        public Human (Human child) {
            this.name = "Stranger";
            this.sex = true;
            this.age = 50;

            this.child = child;
        }
    }
}
