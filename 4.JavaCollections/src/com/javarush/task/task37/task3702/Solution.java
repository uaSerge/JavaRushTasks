package com.javarush.task.task37.task3702;
//Фабрики (4)
//        1. В корне задачи создай интерфейс AbstractFactory, в который вынеси общий в фабриках метод.
//
//        2. Реализуй интерфейс AbstractFactory в обеих фабриках.
//
//        3. В корне задачи создай класс FactoryProducer, в котором создай публичный статический энум HumanFactoryType со значениями MALE, FEMALE.
//
//        4. В FactoryProducer создай публичный статический метод getFactory с аргументом HumanFactoryType.
//        Этот метод должен возвращать одну из фабрик: для ключа MALE - MaleFactory, для FEMALE - FemaleFactory.
//
//        Молодец, Фабрика фабрик готова! Это паттерн Abstract Factory.
//        В коде тебе не важно, какая фабрика используется.
//
//        Твои успехи:
//        1. Освоен паттерн Factory Method.
//        2. Освоен паттерн Abstract Factory.
//        3. +2 паттерна для прохождения собеседования.
//
//        Работа джава программистом стала еще ближе, скоро достигнешь цели!
//
//
//        Требования:
//        1. Класс MaleFactory должен поддерживать интерфейс AbstractFactory.
//        2. Класс FemaleFactory должен поддерживать интерфейс AbstractFactory.
//        3. В классе FactoryProducer должен быть создан enum HumanFactoryType со значениями MALE, FEMALE.
//        4. Метод getFactory в классе FactoryProducer должен принимать один параметр типа HumanFactoryType.
//        5. Метод getFactory в классе FactoryProducer должен возвращать одну из фабрик в зависимости от принятого параметра.
//        Фабрики (3)
//        1. Создай пакет female, в котором создай KidGirl, TeenGirl и Woman аналогично классам из пакета male.
//
//        2. Создай в пакете female фабрику FemaleFactory аналогичную MaleFactory с тем же принципом получения объектов.
//
//        3. Подумай, что общего у двух фабрик? Что можно сделать, чтобы легко можно было переключаться между ними?
//
//        Ответ - в следующем задании.
//
//        Фабрики (2)
//        1. Создай публичный класс MaleFactory в пакете male с публичным методом getPerson, который принимает один параметр int age (возраст) и возвращает нужный объект одного из классов, реализующих интерфейс Human.
//
//        2. Логика метода getPerson: используя константу MAX_AGE определи, какой класс соответствует переданному возрасту.
//        Например, age=4 соответствует мальчику (KidBoy), age=15 - подростку (TeenBoy), остальной возраст - взрослому мужчине.
//
//        3. В методе main класса Solution создай фабрику и вызови у нее метод getPerson три раза с такими параметрами: 99, 4, 15.
//
//        Выведи результат в консоль.
//        Вывод должен быть следующий:
//        Man{}
//        KidBoy{}
//        TeenBoy{}
//
//        Молодец, Фабрика готова! Это паттерн Factory Method.
//
//        Фабрики (1)
//        Привет!
//        Сейчас ты будешь разбираться с паттерном Factory Method. Возьмем пример с людьми.
//        Будем определять, к какому типу относится человек в зависимости от его возраста.
//
//        В этом задании подготовим данные, которые будем использовать в фабрике.
//
//        1. Для всех типов людей создай общий интерфейс Human.
//
//        2. Будем делать Factory для мужчин. Для этого создай пакет male, в котором создай классы KidBoy, TeenBoy, Man.
//        Во всех этих классах реализуй интерфейс Human.
//
//        3. В каждом классе KidBoy, TeenBoy создай свою публичную константу MAX_AGE с соответствующими значениями: 12, 19.
//
//        4. Сгенерируй автоматические методы toString для каждого класса KidBoy, TeenBoy, Man. Получится "KidBoy{}" и т.п.
//
//        5. Создай класс Solution с методом main.

public class Solution {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        useFactory(factory);

        factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        useFactory(factory);
    }

    public static void useFactory(AbstractFactory factory) {
        System.out.println(factory.getPerson(99));
        System.out.println(factory.getPerson(4));
        System.out.println(factory.getPerson(15));
    }

}