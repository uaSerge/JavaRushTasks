package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/*
Ипподром(16)
Теперь уже точно все.

Добавь вызов метода printWinner в конец метода main.

Запускай и любуйся своей первой компьютерной игрой :)


Требования:
1. Метод printWinner должен быть вызван в методе main после метода run.
Ипподром(15)
Добавим определение победителя.
В классе Hippodrome сделаем два метода:
public Horse getWinner() и public void printWinner()

Метод getWinner должен возвращать лошадь пробежавшую самую большую дистанцию.
Метод printWinner выводит на экран имя победителя в виде: Winner is <name>!

Пример:
Winner is Lucky!

Ипподром(14)
Запускаем и любуемся.
У нас каждые полсекунды отображается новый кадр с ситуацией на ипподроме.
Мышкой уменьши размер консоли так, чтобы был виден только один "кадр" и на том же самом месте.

Тогда можно наблюдать забег в живую и даже покомментировать:
- Старт.
- Гомер неожиданно обходит Лаки.
- Слевин вырывается вперед.
- Вперед Лаки!
- 10 баксов на Слевина.
- Похоже Лаки сбросил жокея и расслабился.
- Гомер уверенно вырывается вперед.
- Неожиданно для всех побеждает Гомер. Вот это номер!

Ипподром(13)
Теперь вернемся к методу print класса Horse.

Т.к. мы работаем с консолью, то все лошади на бегах будут выглядеть примерно так:
........Sleven
....Lucky
..........Gomer

Другими словами, в методе print надо вывести на экран строку состоящую из точек и имени лошади.
Количество точек равно distance, округленному (в меньшую сторону) до целого числа.

Ипподром(12)
Осталось совсем немного - дописать класс Horse.
Каждый ход у лошади будет вызываться метод move.
Когда у лошади вызывают метод move, лошадь должна пробежать некоторую дистанцию.
Дистанция зависит от скорости лошади (speed). В самом простом варианте, выглядеть этот метод должен примерно так:
distance += speed;

Но, чтобы было интереснее, давай сделаем так, чтобы скорость все время немного менялась.
Для этого умножь speed на случайное число.
Случайное число можно получить с помощью метода Math.random().
*/

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    void run(){
        for (int i = 0; i < 100; i++) {
        move();
        print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void move(){
        for (Horse horse: horses
             ) {
            horse.move();
        }
    }
    void print(){
        for (Horse horse: horses
                ) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner() {
        Horse win = null;
        for (Horse h : horses
             ) {
            if (win == null) win = h;
            if (win.getDistance() < h.getDistance()) win = h;
        }
        return win;
    }

    public void printWinner(){
        Horse win = getWinner();
        System.out.printf("Winner is %s!",win.getName());
    }

    public static void main(String[] args) {
        List <Horse> list = new ArrayList();
        game = new Hippodrome(list);
        Horse horse1 = new Horse("horse1", 3.0,0.0);
        list.add(horse1);
        Horse horse2 = new Horse("horse2", 3.0,0.0);
        list.add(horse2);
        Horse horse3 = new Horse("horse3", 3.0,0.0);
        list.add(horse3);
        game.run();
        game.printWinner();
    }
}
