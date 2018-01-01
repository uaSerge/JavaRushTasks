package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ann = new Human("Ann",false,90);
        Human sam = new Human("sam",true,90);
        Human anna = new Human("anna",false,90);
        Human samy = new Human("samy",true,90);


        Human mum = new Human("mum",false,32);
        Human dad = new Human("dad",true,32);

        Human olya = new Human("olya",false,5);
        Human wika = new Human("wika",false,10);
        Human wiki = new Human("wiki",false,10);

        ann.children.add(dad);
        sam.children.add(dad);
        anna.children.add(mum);
        samy.children.add(mum);
        mum.children.add(olya);
        mum.children.add(wika);
        mum.children.add(wiki);
        dad.children.add(olya);
        dad.children.add(wika);
        dad.children.add(wiki);
        System.out.println(ann);
        System.out.println(sam);
        System.out.println(anna);
        System.out.println(samy);
        System.out.println(dad);
        System.out.println(mum);
        System.out.println(olya);
        System.out.println(wika);
        System.out.println(wiki);
    }

    public static class Human {
        //напишите тут ваш код
        String name = "qq";
        boolean sex = false;
        int age = 18;
        ArrayList <Human> children = new ArrayList<>();

        public  Human (String name, boolean sex,int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
