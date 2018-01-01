package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human wandy = new Human("wandy", false,40);
        Human vova = new Human("vova", true,42);
        Human wandy3 = new Human("wandy3", false,41);
        Human vova2 = new Human("vova2", true,54);
        Human alex = new Human("alex", true,21, vova,wandy);
        Human alex1 = new Human("alex1", true,21, vova,wandy);
        Human alex2 = new Human("alex2", true,21, vova,wandy);
        Human alex3 = new Human("alex3", true,21, vova,wandy);
        Human alex4 = new Human("alex4", true,21, vova,wandy);
        System.out.println(wandy.toString());
        System.out.println(vova.toString());
        System.out.println(wandy3.toString());
        System.out.println(vova2.toString());
        System.out.println(alex.toString());
        System.out.println(alex1.toString());
        System.out.println(alex2.toString());
        System.out.println(alex3.toString());
        System.out.println(alex4.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















