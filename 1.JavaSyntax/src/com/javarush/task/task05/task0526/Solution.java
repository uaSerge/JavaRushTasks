package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("jon", 18, "Kyiv");
        Man man2 = new Man("van", 21, "Lviv");
        Woman w1 = new Woman("Rebecca", 19, "qatar");
        Woman w2 = new Woman("Jilly", 26, "Odessa");
        man1.address();
        man2.address();
        w1.address();
        w2.address();
    }

        public static class Man {
        String name;
        int age;
        String address;

        public Man (String name, int age,String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void address () {
            System.out.println(name+" "+ age+" "+address);
        }
        }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name, int age,String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public void address () {
            System.out.println(name+" "+ age+" "+address);
        }
    }
    //напишите тут ваш код
}
