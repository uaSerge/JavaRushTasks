package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.DualHashBidiMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;
import com.javarush.task.task33.task3310.tests.FunctionalTest;
import com.javarush.task.task33.task3310.tests.SpeedTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;

import java.util.*;
/*
Shortener (16)
Что можешь сделать самостоятельно (тестов на этот пункт нет):
- Добавить стратегию, основанную на работе с базой данных. Гугли JDBC.
- Сделать веб сервис, который будет для любого url или строки возвращать идентификатор, а для идентификатора строку.
- Написать вариант HashMap с использованием двух потоков, где один поток будет отвечать за работу с элементами, а второй следить за количеством элементов. Когда количество элементов превысит порог threshold, второй поток должен увеличить размер table в 2 раза. При этом, первый поток ничего не должен знать о пороге.

Твои достижения:
- Повторил паттерн Стратегия.
- Получил опыт работы с библиотекой Guava.
- Получил опыт работы с Apache Commons Collections.
- Попробовал писать тесты, используя Junit.
- Еще на шаг продвинулся к работе Java программистом.

Поздравляю! Я горжусь тобой!
Ты отличный ученик!


Требования:
1. Shortener готов!
Shortener (15)
Напишем еще один тест, который проверит, что получить идентификатор для строки используя стратегию HashBiMapStorageStrategy можно быстрее, чем используя стратегию HashMapStorageStrategy.
15.1. Создай класс SpeedTest в пакете tests.
15.2. Добавь в класс метод long getTimeForGettingIds(Shortener shortener, Set<String> strings, Set<Long> ids). Он должен возвращать время в миллисекундах необходимое для получения идентификаторов для всех строк из strings. Идентификаторы должны быть записаны в ids.
15.3. Добавь в класс метод long getTimeForGettingStrings(Shortener shortener, Set<Long> ids, Set<String> strings). Он должен возвращать время в миллисекундах необходимое для получения строк для всех строк из ids. Строки должны быть записаны в strings.
15.4. Добавь в класс SpeedTest тест testHashMapStorage(). Он должен:
15.4.1. Создавать два объекта типа Shortener, один на базе HashMapStorageStrategy, второй на базе HashBiMapStorageStrategy. Назовем их shortener1 и shortener2.
15.4.2. Генерировать с помощью Helper 10000 строк и помещать их в сет со строками, назовем его origStrings.
15.4.3. Получать время получения идентификаторов для origStrings (вызывать метод getTimeForGettingIds для shortener1, а затем для shortener2).
15.4.4. Проверять с помощью junit, что время, полученное в предыдущем пункте для shortener1 больше, чем для shortener2.
15.4.5. Получать время получения строк (вызывать метод getTimeForGettingStrings для shortener1 и shortener2).
15.4.6. Проверять с помощью junit, что время, полученное в предыдущем пункте для shortener1 примерно равно времени для shortener2. Используй метод assertEquals(float expected, float actual, float delta). В качестве delta можно использовать 30, этого вполне достаточно для наших экспериментов.

Shortener (14)
Мы много раз тестировали наши стратегии с помощью метода testStrategy() класса Solution. Пришло время написать настоящие юнит тесты с использованием junit.
14.1. Прочитай что такое юнит тесты.
14.2. Скачай и подключи библиотеку Junit 4.12. Разберись как ей пользоваться. Библиотека Junit зависит от библиотеки hamcrest-core. Подключи и ее. Используй версию 1.3.
14.3. Добавь класс FunctionalTest в пакет tests. В этом классе мы проверим функциональность наших стратегий.
14.4. Добавь в класс FunctionalTest метод testStorage(Shortener shortener). Он должен:
14.4.1. Создавать три строки. Текст 1 и 3 строк должен быть одинаковым.
14.4.2. Получать и сохранять идентификаторы для всех трех строк с помощью shortener.
14.4.3. Проверять, что идентификатор для 2 строки не равен идентификатору для 1 и 3 строк.

Подсказка: метод Assert.assertNotEquals.

14.4.4. Проверять, что идентификаторы для 1 и 3 строк равны.

Подсказка: метод Assert.assertEquals.

14.4.5. Получать три строки по трем идентификаторам с помощью shortener.
14.4.6. Проверять, что строки, полученные в предыдущем пункте, эквивалентны оригинальным.

Подсказка: метод Assert.assertEquals.

14.5. Добавь в класс FunctionalTest тесты:
14.5.1. testHashMapStorageStrategy()
14.5.2. testOurHashMapStorageStrategy()
14.5.3. testFileStorageStrategy()
14.5.4. testHashBiMapStorageStrategy()
14.5.5. testDualHashBidiMapStorageStrategy()
14.5.6. testOurHashBiMapStorageStrategy()
Каждый тест должен иметь аннотацию @Test, создавать подходящую стратегию, создавать объект класса Shortener на базе этой стратегии и вызывать метод testStorage для него.
Запусти и проверь, что все тесты проходят.

Shortener (13)
Рассмотрим еще одну реализацию BiMap, на этот раз из Apache Commons Collections.
13.1. Скачай и подключи Apache Commons Collections 4.0.
13.2. Реализуй стратегию DualHashBidiMapStorageStrategy. Она должна:
13.2.1. Поддерживать интерфейс StorageStrategy.
13.2.2. Внутри иметь только одно поле data с типом DualHashBidiMap.
13.3. Проверь новую стратегию в методе main(). Запусти программу и сравни скорость работы шести стратегий.

Shortener (12)
Задача, когда требуется создать Map, работающий в две стороны (по ключу получать значение, а по значению ключ) не такая уж и редкая. Такие коллекции уже реализованы в различных сторонних библиотеках коллекций. Одна из таких Guava от Google.
12.1. Скачай и подключи библиотеку guava версии 19.0.
12.2. Реализуй стратегию HashBiMapStorageStrategy. Она должна:
12.2.1. Поддерживать интерфейс StorageStrategy.
12.2.2. Внутри иметь только одно поле data типа HashBiMap.
12.3. Проверь новую стратегию в методе main(). Запусти программу и сравни скорость работы пяти стратегий.

Shortener (11)
Как ты заметил, получение идентификатора для строки требует намного больше времени, чем получение строки по идентификатору. Это ожидаемо и следует из реализации HashMap. Давай напишем четвертую стратегию OurHashBiMapStorageStrategy, которая будет лишена этого недостатка.
11.1. Создай класс OurHashBiMapStorageStrategy, реализующий интерфейс StorageStrategy.
11.2. Добавь в него два поля HashMap<Long, String> k2v и HashMap<String, Long> v2k.
Первое будет хранить соответствие ключа и значения, а второе наоборот: значения и ключа.
11.3. Реализуй методы интерфейса StorageStrategy, обеспечив максимальную скорость.

Подсказка: при добавлении новой пары ключ-значение необходимо добавлять ее сразу в два поля.

Проверь новую стратегию в методе main(). Запусти программу и сравни скорость работы всех 4х стратегий. Убедись, что мы значительно увеличили скорость получения идентификатора. Но как ты понимаешь, у этого решения есть не только плюсы, но и минусы.
Подумай в каких случаях имеет смысл использовать OurHashBiMapStorageStrategy, а в каких HashMapStorageStrategy.
*/


public class Solution {

    public static void main(String[] args) {
//        DualHashBidiMapStorageStrategy strategy = new DualHashBidiMapStorageStrategy();
//        testStrategy(strategy,10000L);

        JUnitCore core = new JUnitCore();
        Result result = core.run(FunctionalTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
        System.out.println("------------");
        result = core.run(SpeedTest.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }

    public static Set <Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> set = new HashSet<>();
        for (String s : strings
                ) {
            set.add(shortener.getId(s));
        }
        return set;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> set = new HashSet<>();
        for (Long k : keys
                ) {
            set.add(shortener.getString(k));
        }
        return set;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber){
        System.out.println(strategy.getClass().getSimpleName());
        Set <String> set = new HashSet();
        Shortener shortener = new Shortener(strategy);
        for (int i = 0; i<elementsNumber; i++){
            String s = Helper.generateRandomString();
            set.add(s);
        }

        Date date = new Date();
        long l = date.getTime();
        Set set2 = getIds(shortener,set);
        Date date1 = new Date();
        l = date1.getTime() - l;
        System.out.println(l);
        Date date2 = new Date();
        l = date2.getTime();
        Set set3 = getStrings(shortener,set2);
        Date date3 = new Date();
        l = date3.getTime() - l;
        System.out.println(l);
        if (set.containsAll(set3) && (set3.size()==elementsNumber)) System.out.println("Тест пройден.");
        else System.out.println("Тест не пройден.");
    }

}
