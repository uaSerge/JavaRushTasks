import java.io.*;
import java.util.ArrayList;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        String [] str = s.split("");
        int [] num = new int [str.length] ;

        for (int i  = 0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
            if (num[i]%2 == 0){
                even++;
            }
            else odd++;
        }
        System.out.println("Even: "+even+" Odd: "+odd+"");
    }
}

package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        String [] strings = new String [10];
        for (int i = 0; i<8; i++) {
            strings [i] = sc.next();

        }
       for ( int n = strings.length-1; n>=0; n--) {
            System.out.println(strings[n]);

        }
    }
}

package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] strings = new String [10];
        int [] nums = new int [10];
        for (int i = 0; i<strings.length; i++) {
            strings [i] = sc.readLine();

        }
        for (int i = 0; i<strings.length; i++) {

            nums [i] = strings[i].length();
        }
        for (int i: nums
             ) {
            System.out.println(i);

        }
    }
}
package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [10];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int [] nums1 = new int [10];
        for (int i = 0; i<10; i++) {
            nums1 [nums1.length-1-i] = nums[i];
        }
        for (int i :nums1
             ) {
            System.out.println(i);

        }
    }
}
package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [20];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int [] nums1 = new int [10];
        int [] nums2 = new int [10];

        for (int i = 0; i<10; i++) {
            nums1 [i] = nums[i];
        }
        for (int i = 0; i<10; i++) {
            nums2 [i] = nums[i+10];
        }
        for (int i :nums2
                ) {
            System.out.println(i);

        } }
}

package com.javarush.task.task07.task0706;

import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc= new Scanner(System.in);
        int [] nums = new int [15];
        for (int i = 0; i<nums.length; i++) {
            nums [i] = sc.nextInt();
        }
        int even = 0;
        int i = 0;
        while ( i < nums.length) {
            even = even + nums[i];
            i=i+2;
        }
        int odd = 0;
        i = 1;
        while ( i < nums.length) {
            odd = odd + nums[i];
            i=i+2;
        }
        if (even>odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println( "В домах с нечетными номерами проживает больше жителей.");
    }
}

package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
 //       Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
        arrayList.add(""+i);
        }
        System.out.println(arrayList.size());
        for (String str: arrayList
             ) {
            System.out.println(str);
                }
    }
}

package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Обязательно явно указать тип данных, иначе будет Object
        int max = 0;
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() > max)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем максимальные значения
                max = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == max) //Берем и выводим все максимальные значения, даже если их несколько
                System.out.println(list.get(i));
        }
    }
}

package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(5); //Обязательно явно указать тип данных, иначе будет Object
        list.add(0, reader.readLine());
        int min=list.get(0).length();
        for (int i = 1; i < 5; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() < min)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем минимальные значения
                min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) //Берем и выводим все минимальные значения, даже если их несколько
                System.out.println(list.get(i));
        }
    }
}


package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Обязательно явно указать тип данных, иначе будет Object

        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());}

        for (int i = 0; i < 13; i++){
            String x= list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,x);
        }
        for (String str: list
                ) {
                System.out.println(str);
        }
    }
}


package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
выводим какое число первое - самое большое или самон маленькое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(); //Обязательно явно указать тип данных, иначе будет Object


        String min1 = null;
        String max1 = null;
        int max = 0;
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
            if (list.get(i).length() > max)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем максимальные значения
                max = list.get(i).length();
        }
 //       System.out.println(max);
        int min = max;
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < min)
                // в этом цикле заполняем массив с клавиатуры и тут-же ищем минимальные значения
                min = list.get(i).length();
        }
//        System.out.println(min);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                min1 = list.get(i);
            break;} }
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).length() == max) {
                max1 = list.get(i);
                break;}

        if (list.indexOf(min1)<list.indexOf(max1)) System.out.println(min1);
        else System.out.println(max1);
    }
}

package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add( sc.nextInt());}
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list0 = new ArrayList<>();

        for (int i = 0; i <20; i++) {
            if (list.get(i)%3==0) {
                list3.add(list.get(i));
            }
        }
        for (int i = 0; i <20; i++) {
            if (list.get(i)%2==0) {
                list2.add(list.get(i));
            }
        }
        for (int i = 0; i <20; i++) {
            if (list.get(i)%3!=0 && list.get(i)%2!=0 ) {
                list0.add(list.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(list0);

    }

    public static void printList(List<Integer> list) {
        for (int q : list
             ) {
            System.out.println(q);

        }
        //напишите тут ваш код
    }
}

package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add( sc.next());}
        list.remove(2); //удаляем елемент
        for (int i = list.size()-1; i >=0; i--){
            System.out.println(list.get(i));
        }
    }
}

package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList <>(10);
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1,"именно");
        list.add(3,"именно");
        list.add("именно");
        for (String q : list
             ) {
            System.out.println(q);

        }
    }
}


package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л

Р или Л

1. Создай список слов, заполни его самостоятельно.

2. Метод fix должен:

2.1. удалять из списка строк все слова, содержащие букву «р»

2.2. удваивать все слова содержащие букву «л».

2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.

2.4. с другими словами ничего не делать.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> listN = new ArrayList<String>();
        for (String a: list
             ) {
        if (a.contains("р")&& a.contains("л")) {
        listN.add(a);}
        else if (a.contains("л")){
            listN.add(a);
            listN.add(a);
        }
            if (!a.contains("р")&& !a.contains("л")) {
                listN.add(a);}
        }

        return listN;

    }


package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова

1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList <String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i= 0; i<10; i++) list.add(sc.next());

        ArrayList<String> result = doubleValues(list);
        for (String str : result
             ) {
            System.out.println(str);
        }
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList <String> listN = new ArrayList<>();
        for (String str: list
             ) { listN.add(str);
            listN.add(str);
        }
        return listN;
    }
}


package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность

Проверка на упорядоченность

1. Введи с клавиатуры 10 слов в список строк.

2. Определить, является ли список упорядоченным по возрастанию длины строки.

3. В случае отрицательного ответа вывести на экран номер первого элемента, нарушающего такую упорядоченность.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList <String> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        for (int i= 0; i<10; i++) list.add(sc.readLine());
        int i = 0;
        String iter = null;
        for (String str : list
             ) {
            if (i != 0)
            if (str.length()<iter.length()){ System.out.println(i);break;}
            iter = str;
            i++;
        }
        }
       }


package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <Integer> num = new ArrayList <> ();

        int j = 10;
        for (int i = 0; i < 10; i++) {
          num.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 9; i>=0;i--){
            System.out.println(num.get(i));
        }
    }
}

package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
Ввести с клавиатуры 2 числа N и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.

Примечание: запрещено создавать больше одного списка.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());;
        for (int i = n; i>0; i--){
            list.add(reader.readLine());
        }
        for (int i = 0;i<m; i++) {
            String str = list.get(0);
            list.remove(0);
            list.add(str);
        }
        for (String str: list
             ) {
            System.out.println(str);

        }
    }
}


package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int [] mass = new int[20];
        for (int i = 0; i <20; i++) {
            mass [i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mass);
        minimum = mass [0];
        maximum = mass [19];

        System.out.println(maximum);
        System.out.println(minimum);
    }
}

package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введет строку «end«. Саму строку «end» не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList <String> list = new ArrayList<>();
        String s = null;
        while (true) {
            s = reader.readLine();
            if (s.equals("end")) break;
            list.add(s);
        }
        for (String str : list
             ) {
            System.out.println(str);
        }
    }
}

package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
Обратный отсчёт
Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст «Бум!».
Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
Thread.sleep(100); //задержка на одну десятую секунды.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}


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


package com.javarush.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из котов

Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        HashMap <String,Cat> mapC = new HashMap<>();
        for (String cat : cats
             ) {
            mapC.put(cat, new Cat(cat));
        }
        return  mapC;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}


package com.javarush.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;

/* 
Вывести на экран список ключей

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список ключей, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //напишите тут ваш код

        for (String key: map.keySet()
             ) {
            System.out.println(key);
        }
    }
}


package com.javarush.task.task08.task0805;

import java.util.HashMap;
import java.util.Map;

/* 
На экране — значения!
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map) {
        //напишите тут ваш код
        for (String val : map.values()
             ) {
            System.out.println(val);
        }

    }
}



package com.javarush.task.task08.task0806;

import java.util.HashMap;
import java.util.Map;

/* 
Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //напишите тут ваш код

        for (Map.Entry en : map.entrySet()
             ) {
            System.out.println(en.getKey() + " - "+ en.getValue());
        }
    }
}

package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только 5 методов.
4. Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
5. Метод get10000(List list) должен вызывать 10 тысяч раз get у списка.
6. Метод set10000(List list) должен вызывать 10 тысяч раз set у списка.
7. Метод remove10000(List list) должен удалять 10 тысяч элементов из списка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
    }

    public static void get10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.set(i,new Object());
        }
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++) {
            list.remove(0);
        }
    }
}


package com.javarush.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Время для 10 тысяч вызовов get
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet должен вернуть время своего исполнения в миллисекундах.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getTimeMsOfGet(List list) {
        //напишите тут ваш код
        Date date = new Date();
        get10000(list);
        //напишите тут ваш код
        return new Date().getTime() - date.getTime();
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}



package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
Реализовать 4 метода.
Каждый из них должен возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution {
    public static List getListForGet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForSet() {
        //напишите тут ваш код
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static List getListForAddOrInsert() {
        //напишите тут ваш код
        LinkedList list = new LinkedList();
return list;
    }

    public static List getListForRemove() {
        //напишите тут ваш код
        LinkedList list = new LinkedList();
        return list;
    }

    public static void main(String[] args) {

    }
}


package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
1. Создай список чисел.

2. Добавь в список 10 чисел с клавиатуры.

3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
    ArrayList <Integer> list = new ArrayList();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int x = 1, y = 0;
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
            if (i != 0) {
                if (list.get(i).equals(list.get(i-1))) {
                    x++;
                    if (x > y) y = x;
                } else x = 1;
            } }
            System.out.println(y);
        }

    }



package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
    HashSet <String> set = new HashSet<>();
    set.add("Л");
        set.add("Лй");
        set.add("Лц");
        set.add("Лу");
        set.add("Лк");

        set.add("Ле");
        set.add("Лн");
        set.add("Лг");
        set.add("Лш");
        set.add("Лщ");

        set.add("Лз");
        set.add("Лф");
        set.add("Лі");
        set.add("Лв");
        set.add("Ла");

        set.add("Лп");
        set.add("Лр");
        set.add("Ло");
        set.add("Лл");
        set.add("Лд");
    return  set;
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
    HashSet <Integer> set = new HashSet<>();
    set.add(11);
        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);

        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        set.add(9);
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(14);

        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
    return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        HashSet rSet = new HashSet<>();
        for (Integer i : set) {
            if (i <= 10) rSet.add(i);
        }
        return rSet;

    }

    public static void main(String[] args) {
//        HashSet <Integer> set = createSet();
//        removeAllNumbersMoreThan10(set);
//        for (Integer i: set
//             ) {
//            System.out.println(i);
//
//        }
    }
}

package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
    HashMap <String,String> map = new HashMap<>();
    map.put("qq","aa");
        map.put("qq123","aa");
        map.put("qq1","aa");
        map.put("qq2","aa");
        map.put("qq3","aa");

        map.put("qq4","aa");
        map.put("qq5","aa");
        map.put("qq6","aa");
        map.put("qq7","aa");
        map.put("qq8","aa");

        
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) count++; }
            return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код

        return 1;
    }

    public static void main(String[] args) {

    }
}


package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

package com.javarush.task.task08.task0817;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» — «имя».
Удалить людей, имеющих одинаковые имена.

Требования:

1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
5. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
6. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> map = new HashMap <String, String>();
        map.put("Stallone", "QQ");
        map.put("Stallone1", "WW");
        map.put("Stallone2", "RR");
        map.put("Stallone3", "AA");
        map.put("Stallone4", "ZZ");
        map.put("Stallone5", "DD");
        map.put("Stallone6", "FF");
        map.put("Stallone7", "CC");
        map.put("Stallone8", "CC");
        map.put("Stallone9", "CC");
    return  map;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry <String, String> pair: copy.entrySet()) {
            if ((Collections.frequency(map.values(), pair.getValue())) > 1)
                Solution.removeItemFromMapByValue(map, pair.getValue());
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap <String, String> (map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//      HashMap <String,String> map =  Solution.createMap();
//      Solution.removeTheFirstNameDuplicates(map);
//        for (Map.Entry <String,String> pair : map.entrySet()
//             ) {
//            System.out.println(pair.getKey() + " " +pair.getValue());
//        }
    }
}

package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap <String, Integer> map = new HashMap <> ();
        for (int i=0; i<10; i++) {
            map.put("Name"+i,480+(i*10));
            }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap <String,Integer> copy = new HashMap<>(map);
        for (Map.Entry pair: copy.entrySet()) {
            if ((int)pair.getValue()<500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
       Iterator <Cat> it = cats.iterator();
            cats.remove(it.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set <Cat> cats = new HashSet<>();
        cats.add(new Cat()); cats.add(new Cat()); cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) 
    {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
    public static class Cat {
            }
    // step 1 - пункт 1
}

package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех животных — всех котов и собак.
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код

        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet <Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet pets = new HashSet();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for ( Object pet : pets ) {
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Dog {}

    public static class Cat{}
}

package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map <String,String> map = new HashMap();
        map.put("Stallone", "QQ");
        map.put("Stallone1", "WW");
        map.put("Stallone2", "RR");
        map.put("Stallone3", "AA");
        map.put("Stallone4", "ZZ");
        map.put("Stallone4", "DD");
        map.put("Stallone6", "FF");
        map.put("Stallone7", "CC");
        map.put("Stallone8", "CC");
        map.put("Stallone9", "CC");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}


package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список — метод getIntegerList.
3. Найти минимальное число среди элементов списка — метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        Collections.sort(array);

        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
        Scanner sc = new Scanner(System.in);
        List list = new ArrayList();

        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }
}


package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] words = s.split("\\b");
        for (String word : words){
            System.out.print(word.substring(0,1).toUpperCase() + word.substring(1) + " ");
        }
        //напишите тут ваш код
    }
}


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


package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int[] copy = array.clone();
        Arrays.sort(copy);
        int i = copy.length-1;
        for (int num : copy
             ) {
            array[i] = num;
            i--;
        }
    }
}


package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date d = new Date(date);
        Date first = new Date("JAN 1 "+(1900+d.getYear()));
        long oneDay = 24 * 60 * 60 * 1000;
        long time = (d.getTime() - first.getTime()) / oneDay;
        return (time % 2 == 0)? true : false;
    }
}

package com.javarush.task.task09.task0901;

/* 
Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
        Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        return  Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();

    }
}

package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

  //      System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public static String method1() {
        method2();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method2() {
        method3();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }

    public static String method5() {
        //напишите тут ваш код
        String s=Thread.currentThread().getStackTrace()[2].getMethodName();
        return s;
    }
}

package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        return   stack[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        return   stack[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        return   stack[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        return   stack[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement [] stack = Thread.currentThread().getStackTrace();
        return   stack[2].getLineNumber();
    }
}

package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
        System.out.println(method1());
    }

    public static StackTraceElement[] method1() {

        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {

        return Thread.currentThread().getStackTrace();
    }
}


package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
аписать метод, который возвращает результат – глубину его стек-трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();

    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement [] staсk = Thread.currentThread().getStackTrace();
        int deep = staсk.length;
        System.out.println(deep);
        return deep;
    }
}

package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName()+": "+Thread.currentThread().getStackTrace()[2].getMethodName()+": "+s);
    }
}

package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
try {
    String s = null;
    String m = s.toLowerCase();
} catch (NullPointerException npe) {
    System.out.println(npe);
}
        //напишите тут ваш код
    }
}

package com.javarush.task.task09.task0909;

/* 
Исключение при работе с массивами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {System.out.println(ex);}
                //напишите тут ваш код
    }
}

package com.javarush.task.task09.task0910;

import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
       catch (IndexOutOfBoundsException ex) {
           System.out.println(ex);
       }

        //напишите тут ваш код
    }
}

package com.javarush.task.task09.task0911;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        //напишите тут ваш код
    }
}

package com.javarush.task.task09.task0912;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
                    }
        //напишите тут ваш код
    }
}

package com.javarush.task.task09.task0913;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/* 
Исключения. Просто исключения.
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
Как это сделать?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            method1();
        }
        catch (NullPointerException exN) {
            System.out.println(exN);
        }
        catch (FileNotFoundException exF) {
            System.out.println(exF);
        }
        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}

package com.javarush.task.task09.task0914;

/* 
Группа перехвата исключений
1. Есть три исключения последовательно унаследованные от Exception:
2. class Exception1 extends Exception
3. class Exception2 extends Exception1
4. class Exception3 extends Exception2
5. Есть метод, который описан так:
public static void method1() throws Exception1, Exception2, Exception3
6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        } catch (Exception3 ex1){}
        catch (Exception2 ex){} 
        catch (Exception1 ex1){}
         //напишите тут ваш код
    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0)
            throw new Exception1();
        if (i == 1)
            throw new Exception2();
        if (i == 2)
            throw new Exception3();
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}

package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
1. Разберись, какие исключения бросает метод BEAN.methodThrowExceptions.
2. Метод processExceptions должен вызывать метод BEAN.methodThrowExceptions и обрабатывать исключения:
2.1. если возникло исключение FileSystemException, то логировать его (вызвать метод BEAN.log) и пробросить дальше
2.2. если возникло исключение CharConversionException или любое другое IOException, то только логировать его (вызвать метод BEAN.log)
3. Добавь в объявление метода processExceptions класс исключения, которое ты пробрасываешь в п.2.1.
4. В методе main обработай оставшееся исключение — логируй его. Используй try..catch

Подсказка:
Если ты захватил исключение MyException, которое не хотел захватывать, его можно пробросить дальше кодом вида:
catch (MyException e) {
 throw e;
}
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        } catch (FileSystemException ex) {
            BEAN.log(ex);
        }

    }

    public static void processExceptions() throws FileSystemException
    {
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException ex) {
            BEAN.log(ex);
            throw ex;
        }
//        catch (CharConversionException ex) {
//            BEAN.log(ex);
//        }
        catch (IOException ex) {
            BEAN.log(ex);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}

package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..catch
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}

package com.javarush.task.task09.task0917;

/* 
Перехват unchecked-исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..catch
*/

public class Solution {
    public static void main(String[] args) {

        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException ex) {
            printStack(ex);
        }
        }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

package com.javarush.task.task09.task0919;

/* 
Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution {

    public static void main(String[] args) {
        try { 
            divisionByZero(); 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } } 
        
        public static void divisionByZero () { 
        int a = 10/0; 
        System.out.println(a); 
    }
}

package com.javarush.task.task09.task0920;

/* 
Обратный отсчёт
Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.println(ex);
            }

            //напишите тут ваш код
        }
    }
}

package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Обернуть все тело (код внутри readData) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution {
    public static void main(String[] args) {
        
        readData();
    }
    
    public static void readData() {
        //напишите тут ваш код
        ArrayList <Integer> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(System.in);

            while (true) {
                list.add(sc.nextInt());
            }
        } catch (Exception ex) {
            for (Integer i: list
                    ) {
                System.out.println(i);
            }
        }
    }
    
}

package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String d = sc.next();
        SimpleDateFormat dateF = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        Date date = new Date(d);
        System.out.println(dateF.format(date).toUpperCase());
    }
}

package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая — только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String string = sc.readLine();
        char [] c = string.toCharArray();
        ArrayList <Character> list1 = new ArrayList<>();
        ArrayList <Character> list2 = new ArrayList<>();
        for (Character ch : c ) {
            if (isVowel(ch))
            {list1.add(ch);
                System.out.print(ch+" ");
            }
            else list2.add(ch);
        }
        System.out.println();
        for (Character ch : list2) {
            if (!ch.equals(' '))
            System.out.print(ch+" ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}

package com.javarush.task.task09.task0925;

/* 
Статики не на своем месте
Расставь модификаторы static так, чтобы пример скомпилировался.
*/

public class Solution {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution room = new Solution();
        room.A = 5;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }

}

package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> list = new ArrayList<>();
        int [] f = {1,2,3,4,5};
        int [] f2 = {1,2};
        int [] f3 = {1,2,3,4};
        int [] f4 = {1,2,3,4,5,6,7};
        int [] f5 = {};
        list.add(f);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String,Cat> cats = new HashMap<>();
        cats.put("Asia",new Cat("Asia"));
        cats.put("Asia1",new Cat("Asia1"));
        cats.put("Asia2",new Cat("Asia2"));
        cats.put("Asia3",new Cat("Asia3"));
        cats.put("Asia4",new Cat("Asia4"));
        cats.put("Asia5",new Cat("Asia5"));
        cats.put("Asia6",new Cat("Asia6"));
        cats.put("Asia7",new Cat("Asia7"));
        cats.put("Asia8",new Cat("Asia8"));
        cats.put("Asia9",new Cat("Asia9"));
        return  cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set <Cat> setCat = new HashSet<>();
        for (Map.Entry entry: map.entrySet()) {
            setCat.add((Cat) entry.getValue());
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b=0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (byte) (i + f);
        System.out.println(b);
    }
}

package com.javarush.task.task10.task1004;

/* 
Задача №4 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: nine=9
short number = 9;
char zero = ‘0’;
int nine = (zero + number);
*/

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero =  '0';
        int nine =  (zero +  number);
        System.out.println((char)nine);
    }
}

package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: result: 1000.0
short b = (short) 45;
char c = (short)‘c’;
short s = (short)1005.22;
int i = (short)150000;
float f =(short)4.10f;
double d = (short)1.256d;
double result = (f * b) + (i / c) — (d * s) + 562.78d;
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45;// 45 +
        char c = (short) 'c'; // 99 +
        short s = (short) 1005.22;// 1005 +
        int i = (int) 150000; // 18928
        float f = (float) 4.10f;// 4
        double d = (double) 1.256d;// 1 +
        double result = (f * b) + (i / c) - (d * s) + 562.78d; //-71.22
        System.out.println("result: " + result);
    }
}
package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
Убери ненужные операторы приведения типа, чтобы получился ответ: 1234567
long l = (byte)111_1111_111_110L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x — (float)m;
l = (long) f / 1000;
*/

public class Solution {
    public static void main(String[] args) {
        long l = (long) 111_1111_111_110L; //-58
        int x = (int) 0b1000_1100_1010; //54
        double m = (double) 110_987_654_6299.123_34; // -1
        float f = (long) l++ + 10 + ++x - (float) m; // -100
        l = (long) f / 1000; // 0
        System.out.println(l);
    }
}

package com.javarush.task.task10.task1011;

/* 
Большая зарплата
Вывести на экран надпись «Я не хочу изучать Java, я хочу большую зарплату» 40 раз по образцу.

Образец:
Я не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
не хочу изучать Java, я хочу большую зарплату
е хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
хочу изучать Java, я хочу большую зарплату
…
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        ArrayList <Character> list = new ArrayList ();
        char [] str = s.toCharArray();
        for ( Character c : str
             ) {
            list.add(c);
        }
        for (int i = 0; i<40; i++){
            for (Character c : list) {
                System.out.print(c);
                }
            list.remove(0);
            System.out.println();
            }
        }
    }

package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // напишите тут ваш код
        ArrayList <Character> all = new ArrayList<>();
        for (String str : list
             ) {
            char [] ch = str.toCharArray();
            for (char c : ch
                 ) {
                all.add(c);
            }
        }
        Collections.sort(all);

        for (Character c : alphabet) {
            int count = 0;
            for (int i = 0; i< all.size(); i++)
            if (c.equals(all.get(i))) {count++;}
            System.out.println(c + " " + count);

            }
        }
    }


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

package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.


Требования:
1. Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList.
2. Метод createList должен возвращать созданный массив.
3. Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
4. Программа должна выводить данные на экран.
5. Метод main должен вызывать метод createList.
6. Метод main должен вызывать метод printList.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList <String> [] list = new ArrayList  [2] ;
        list [0] = new ArrayList ();
        list[0].add("lknkln");
        list[0].add("sfsdf");
        list [1] = new ArrayList ();
        list[1].add("hfh");
        list[1].add("dfsfssf");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}

package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов.
Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка, а второй – число, сколько раз данная строка встречалась в списке.

Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        //напишите тут ваш код
        for (String s : list
             ) {
            result.put(s,Collections.frequency(list,s));
        }
        return result;
    }

}

package com.javarush.task.task10.task1017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Безопасное извлечение из списка
Создать список целых чисел.
Ввести с клавиатуры 20 целых чисел.
Создать метод по безопасному извлечению чисел из списка:
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
Метод должен возвращать элемент списка (list) по его индексу (index).
Если в процессе получения элемента возникло исключение, его нужно перехватить, и метод должен вернуть defaultValu
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        //напишите тут ваш код
        int value = defaultValue;
        try {
             value = list.get(index);
            return value;
        } catch (Exception ex) {
            return defaultValue;
        }
    //    return value;
    }

}

package com.javarush.task.task11.task1123;

import java.util.ArrayList;
import java.util.Collections;

/*
Минимакс
Написать метод, который возвращает минимальное и максимальное числа в массиве.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Допиши реализацию метода getMinimumAndMaximum, он должен возвращать пару из минимума и максимума.
3. Метод main не изменять.
4. Программа должна вывести правильный результат.
5. Метод main должен вызывать метод getMinimumAndMaximum.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //Напишите тут ваше решение
        ArrayList <Integer> list = new ArrayList<>();
        for (Integer i: array
             ) {
            list.add(i);
            }
        Collections.sort(list);

        return new Pair<Integer, Integer>(list.get(0), list.get(list.size()-1));
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Напишите тут ваше решение
        String s = o.getClass().getSimpleName();
        switch (s){
            case ("Cat"):
                System.out.println("Кошка"); break;
            case ("Bird"):
                System.out.println("Птица"); break;
            case ("Lamp"):
                System.out.println("Лампа"); break;
            case ("Dog"):
                System.out.println("Собака"); break;
        }
 //       System.out.println(o.getClass().getSimpleName());
    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}

package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
Напиши метод, который определяет, какой объект передали в него.
Программа должна выводить на экран одну из надписей:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String s = o.getClass().getSimpleName();
        switch (s){
            case ("Cat"): return "Кот";
            case ("Tiger"): return "Тигр";
            case ("Lion"): return "Лев";
            case ("Bull"): return "Бык";
            default: return "хз";
        }

    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i: array
                ) {
            list.add(i);
        }
        Collections.sort(list);
        int min = list.get(0);
        int index = 0;
        int i = 0;
        for (int j : array
             ) {
            if (j == min) {
                index = i;
                }
            i++;
        }
        return new Pair<Integer, Integer>(min,index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Программа должна выводить на экран содержимое файла.
3. Поток чтения из файла (FileInputStream) должен быть закрыт.
4. BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        try { String file = sc.readLine();
        //    FileInputStream foStream = new FileInputStream(file);
            Scanner scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            sc.close();
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();

        }



    }
}

package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа должна читывать строки с консоли, пока пользователь не введет строку "exit".
4. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
5. Метод main должен закрывать объект типа BufferedWriter после использования.
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String file = "file";
        try {
             file = buf.readLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String s = "";
            while (!s.equals("exit")) {
                 s = buf.readLine();
                bw.write(s);
                bw.write(System.lineSeparator());
                            }
            buf.close();
            bw.close();
        } catch (Exception e ) { e.printStackTrace();}
        finally {

        }

       }
}
package com.javarush.task.task13.task1320;

/* 
Neo
1. Реализовать интерфейс DBObject в классе User.
2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран «User has name Neo, id = 1«.
3. Метод toString и метод main менять нельзя.
4. Подумай, что должен возвращать метод initializeIdAndName в классе User.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject{
        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }
}

package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
3. Программа должна выводить данные на экран.
4. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        InputStreamReader inputStreamReader1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader1);
        String file = "";
        try {
            file = br.readLine();
            br.close();
            inputStreamReader1.close();
            FileInputStream f = new FileInputStream(file);
            InputStreamReader inputStreamReader2 = new InputStreamReader(f);
            br = new BufferedReader(inputStreamReader2);
            String c;
            Integer k;
            ArrayList <Integer> list = new ArrayList<> ();
            while (br.ready()) {c=br.readLine();
                k = Integer.parseInt(c);
                list.add(k);
                }
            f.close();
            inputStreamReader2.close();
            br.close();
            Collections.sort(list);
            for (Integer i: list
                 ) {
            if (i%2==0) {
                System.out.println(i);
            } }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

         }
}

package com.javarush.task.task14.task1404;

/* 
Коты
1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
2. Каждый параметр соответствует имени кота.

Для каждого параметра:
3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
4. Вывести на экран cat.toString().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = buf.readLine();
            if (s.equals("")) break;
            Cat cat =CatFactory.getCatByKey(s);
            System.out.println(cat.toString());
        }

    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}

package com.javarush.task.task14.task1407;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Player and Dancer
1. Подумать, что делает программа.
2. Изменить метод haveRest так, чтобы он вызывал метод
— play, если person имеет тип Player.
— dance, если person имеет тип Dancer.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveRest(person);
        }
    }

    public static void haveRest(Person person) {
        //напишите тут ваш код
        if (person instanceof Player) {((Player) person).play();}
        if (person instanceof Dancer) {((Dancer) person).dance();}
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}

package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: «user«, «loser«, «coder«, «proger«.
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см. Person.java], например, для строки «user» нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Loser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        key = reader.readLine();
        if (!key.equals("")){
            while (key.equals("user")||key.equals("loser")||key.equals("coder")||key.equals("proger")) {
            switch (key) {
                case ("user"):
                    person = new Person.User();break;
                case ("loser"):
                    person = new Person.Loser();break;
                case ("coder"):
                    person = new Person.Coder();break;
                case ("proger"):
                    person = new Person.Proger();break;
                default:
                    break;}
            doWork(person);
            key = reader.readLine();
        } } }

    public static void doWork(Person person) {
        // пункт 3
    if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).coding();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();

    }
}
public interface Person {
    class User implements Person {
        void live() {
            System.out.println("Usually I just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("Usually I do nothing.");
        }
    }

    class Coder implements Person {
        void coding() {
            System.out.println("Usually I create code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("Wonderful life!");
        }
    }
}

package com.javarush.task.task14.task1414;

/* 
MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу «soapOpera«.

Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа «cartoon«.
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа «thriller«.
7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: «cartoon«, «thriller«, «soapOpera«.
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        Movie movie = null;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String key = sc.readLine();
        while (key.equals("soapOpera")|| key.equals("cartoon")||key.equals("thriller")) {
            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
            key = sc.readLine();
        }
        movie = MovieFactory.getMovie(key);

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {}

    static class SoapOpera extends Movie {}
    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie {}

    static class Thriller extends Movie {}

}

package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
1. Реализовать метод cleanAllApartments.
Для каждого объекта из apartments:
2. Для однокомнатных квартир (Apt1Room) вызвать метод clean1Room.
т.е. если объект типа Apt1Room, то вызвать у него метод clean1Room.
3. Для двухкомнатных квартир (Apt2Room) вызвать метод clean2Rooms
т.е. если объект типа Apt2Room, то вызвать у него метод clean2Rooms.
4. Для трехкомнатных квартир (Apt3Room) вызвать метод clean3Rooms
т.е. если объект типа Apt3Room, то вызвать у него метод clean3Rooms.
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for (Apartment ap : apartments
             ) {
            if (ap instanceof Apt1Room) ((Apt1Room) ap).clean1Room();
            if (ap instanceof Apt2Room) ((Apt2Room) ap).clean2Rooms();
            if (ap instanceof Apt3Room) ((Apt3Room) ap).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}

package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
1. Подумай что делает метод main.
2. Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
3. Найди блок кода которая заполняет значениями список и перемести его в метод initList.
4. Найди блок кода который в цикле for выводит на экран содержимое списка и перемести его в метод printListValues.
5. Найди блок кода в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран и перемести его в метод processCastedObjects.
6. Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
7. Исправь 2 ошибки в методе processCastedObjects связанные с приведением типов
— для объекта типа Float нужно вывести «Is float value defined? » + !([Float_object].isNaN()).
— для объекта типа Double нужно вывести «Is double value infinite? » + [Double_object].isInfinite().
*/

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        //3
        initList(list);
        printListValues(list);
        processCastedObjects(list);
        }
    static  void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }
    static void printListValues(List<Number> list) {
        //4 - Исправь 2 ошибки
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static void processCastedObjects(List<Number> list) {
        //5
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
    }
}

package com.javarush.task.task14.task1419;


import java.util.*;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
            String s = "";

        }
        catch (Exception e) {exceptions.add(new ArithmeticException());
            exceptions.add(new NullPointerException());
            exceptions.add(new NoSuchElementException ());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new ClassCastException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new NegativeArraySizeException());
            exceptions.add(new IllegalStateException());
            exceptions.add(new SecurityException());
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
}

package com.javarush.task.task14.task1421;

/** Singleton
 * Created by Serge on 07.09.2017.
 * Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.

 Реализовать Singleton pattern:
 1. Создай класс Singleton в отдельном файле.
 2. Добавь в него статический метод getInstance().
 3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
 4. Подумай, каким образом можно запретить создание других объектов этого класса.
 5. Сделай все конструкторы в классе Singleton приватными (private).
 6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance () {

        return instance;
            }
}

package com.javarush.task.task14.task1420;

/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(buf.readLine());
            int b = Integer.parseInt(buf.readLine());
            if (a<=0||b<=0) throw new Exception();
            int max = 0;
            for (int i = 1; i < (a < b ? a : b) + 1; i++) {
                if((a%i == 0) && (b%i == 0)) max = i;
            }
//            while (a != b) {
//                if (a > b) a = a - b;
//                else b = b - a; }
            System.out.println(max);
        } catch (Exception e) { throw e;}
    }
}
package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора — название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

public class Solution {

    public static class MarkTwainBook extends Book{
        private String title;
        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
    public static class AgathaChristieBook extends Book{
        private String title;
        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            //Add your code here
            if (this instanceof AgathaChristieBook) output = agathaChristieOutput;
            if (this instanceof MarkTwainBook) output = markTwainOutput;
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово «exit«.
2. Для каждого значения, кроме «exit«, вызвать метод print. Если значение:
2.1. содержит точку ‘.‘, то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. меньше нуля или больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s ;
        while (!(s=buf.readLine()).equals("exit")) {
            try {
                int k = Integer.parseInt(s);
                if (k > 0 && k < 128) print((short) k);
                else if (k <= 0 || k >= 128) print((Integer) k);
            } catch (Exception e) {
        //        e.printStackTrace();
                try {
                    if (s.indexOf(".") != (-1)) {
                        print(Double.valueOf(s));
                    } else print(s);
                } catch (Exception e1) {print(s);}

            }
          //      s = buf.readLine();

        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}

package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
Разберись, что и в какой последовательности инициализируется. Поставь брейкпойнты и используй дебаггер.

Исправить порядок инициализации данных так, чтобы результат был следующим:
static void init()
Static block
public static void main
non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name
*/

public class Solution {
    static {
        init();
    }
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");

        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}

package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static  {
        try {
            BufferedReader b = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME)));
            String s = null;
            while (b.ready()){
                s = b.readLine();
                lines.add(s);
            }
//            System.out.println(lines);

        } catch (Exception e) {e.printStackTrace();}
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) — для чисел (дробные числа разделяются точкой)
alert(String value) — для строк
Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = b.readLine();
            String [] s1 = s.split("\\?");
            String [] s2 = s1[1].split("&");
            for (String str: s2) {
                String[] str2 = str.split("=");
                System.out.print(str2[0]+" ");
            }

            for (String str: s2) {
                String[] str2 = str.split("=");
                if (str2[0].contains("obj")) {
                    try {
                        System.out.println();
                        alert(Double.valueOf(str2[1]));
                    } catch (Exception e){ alert(str2[1]);}

                }
            }

        }catch (Exception e) {e.printStackTrace();}
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}

package com.javarush.task.task16.task1604;

/* 
Вывод стек-трейса
1. Создать таск (public static класс SpecialThread, который реализует интерфейс Runnable).
2. SpecialThread должен выводить в консоль свой стек-трейс.

Подсказка: main thread уже выводит в консоль свой стек-трейс.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }
    public static class SpecialThread implements Runnable{
        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
        }
    }
}

package com.javarush.task.task16.task1605;

import java.util.Date;

/* 
Поговорим о музыке
1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры — метод startPlaying().
2.2. Подожди 1 секунду — метод sleepNSeconds(int n), где n — количество секунд.
2.3. Считай время окончания игры — метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах.

Пример «Playing 1002 ms«.
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }

    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public interface MusicalInstrument extends Runnable {
        Date startPlaying();

        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument{
        private String owner;

        public Violin(String owner) {
            this.owner = owner;
        }

        @Override
        public void run() {
            Date start = startPlaying();
            Solution.sleepNSeconds(1);
            Date stop = stopPlaying();
            Long a = stop.getTime() - start.getTime();
            System.out.println("Playing "+a+" ms");
        }

        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }
    }
}

package com.javarush.task.task16.task1606;

import java.util.ArrayList;
import java.util.List;

/* 
join: в нужное время в нужном месте
Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызови метод join в нужном месте.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();
    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        public PrintListThread(String name) {
            super(name);
        }

        public void run() {
            printList(getList(20), getName());
        }
    }
}
package com.javarush.task.task16.task1607;

import java.util.ArrayList;
import java.util.List;

/* 
Horse Racing
1. Посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
2. Если лошадь еще не пришла к финишу (!isFinished()), то:
2.1. Вывести в консоль «Waiting for » + horse.getName().
2.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.
*/

public class Solution {
    public static int countHorses = 10;

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = prepareHorsesAndStart();
        while (calculateHorsesFinished(horses) != countHorses) {
        }
    }

    public static int calculateHorsesFinished(List<Horse> horses) throws InterruptedException {
        int countFinished = 0;
        //add your implementation here - добавь свою реалзацию тут
//        while (!(countFinished==horses.size())){
        for (int i = 0; i < horses.size(); i++){
            if (horses.get(i).isFinished()){
                countFinished++;
            } else { System.out.println("Waiting for "+horses.get(i).getName());
            horses.get(i).join();
            } }
 //       System.out.println(countFinished);
        return countFinished;
    }

    public static List<Horse> prepareHorsesAndStart() {
        List<Horse> horses = new ArrayList<Horse>(countHorses);
        String number;
        for (int i = 1; i < countHorses + 1; i++) {
            number = i < 10 ? ("0" + i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < countHorses; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   //delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
package com.javarush.task.task16.task1608;

/* 
Продвижение на политических дебатах
1. Разберись, что делает программа.
2. Нужно сделать так, чтобы Иванов сказал больше всего речей на политических дебатах.
3. Подумай, какой метод можно вызвать у объекта ivanov, чтобы Иванов разговаривал, пока не завершится всё свободное время.
*/

public class Solution {
    public static int totalCountSpeeches = 200;
    public static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
        ivanov.join();
        Politician petrov = new Politician("Петров");
        Politician sidorov = new Politician("Сидоров");

        while (ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() < totalCountSpeeches) {
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int countSounds;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (countSounds < totalCountSpeeches * soundsInOneSpeech) {
                countSounds++;
            }
        }

        public int getCountSpeeches() {
            return countSounds / soundsInOneSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeeches());
        }
    }
}

package com.javarush.task.task16.task1609;

/* 
Справедливость
1. Разберись, что делает программа.
2. Нужно сделать так, чтобы все мыши ели одновременно.
3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
4. Удали вызов этого метода.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Mouse alpha = new Mouse("#1");
 //       alpha.join();
        Mouse mouse1 = new Mouse("#2");
        Mouse mouse2 = new Mouse("#3");
    }

    private static void eating() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }

    public static class Mouse extends Thread {
        public Mouse(String name) {
            super(name);
            start();
        }

        public void run() {
            System.out.println(getName() + " starts eating");
            eating();
            System.out.println(getName() + " finished eating");
        }
    }
}
package com.javarush.task.task16.task1610;

/* 
Расставь вызовы методов join()
1. Разберись, что делает программа.
2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
2.1. Сначала кошка рожает котят.
2.2. Потом все котята вылазят из корзинки в произвольном порядке.
2.3. В конце кошка собирает их назад в корзинку.
2.4. Все события для одной кошки могут быть перемешаны с событиями для другой кошки.
2.5. Добавить сон котят (200 мс) в investigateWorld.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.currentThread().sleep(200);
        } catch (InterruptedException e ) {e.printStackTrace();}
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run() {
            System.out.println(getName() + " родила 2 котенка");
            try {
                initAllKitten();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKitten() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            investigateWorld();
        }
    }
}

package com.javarush.task.task16.task1611;

/* 
Часы
1. Разберись, что делает программа.
2. Реализуй логику метода printTikTak:
2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("Clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            //add your code here - добавь код тут
            Thread.currentThread().sleep(500);
            System.out.println("Tik");
            Thread.currentThread().sleep(500);
            System.out.println("Tak");
        }
    }
}
package com.javarush.task.task16.task1612;

/* 
Stopwatch (Секундомер)
1. Разберись, что делает программа.
2. Реализуй логику метода doStep так, чтобы учитывалась скорость бегуна.
2.1. Метод getSpeed() в классе Runner показывает, сколько шагов в секунду делает бегун.
Нужно, чтобы бегун действительно делал заданное количество шагов в секунду.
Если Иванов делает 4 шага в секунду, то за 2 секунды он сделает 8 шагов.
Если Петров делает 2 шага в секунду, то за 2 секунды он сделает 4 шага.
2.2. Метод sleep в классе Thread принимает параметр типа long.

ВАЖНО! Используй метод Thread.sleep(), а не Stopwatch.sleep().
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner ivanov = new Runner("Ivanov", 4);
        Runner petrov = new Runner("Petrov", 2);
        //на старт!
        //внимание!
        //марш!
        ivanov.start();
        petrov.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException e) {
            }
        }

        private void doStep() throws InterruptedException {
            stepNumber++;
            //add your code here - добавь код тут
            Thread.currentThread().sleep(1000/owner.getSpeed());


            System.out.println(owner.getName() + " делает шаг №" + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }
}

package com.javarush.task.task16.task1613;

/* 
Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("Лондон", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут
            Thread.currentThread().sleep(1000);
            if (seconds==59){
                seconds=0;
                if (minutes==59){ minutes=0;
                    if (hours==23){
                        hours=0;
                    } else hours++;
                }
                else minutes++;
                }
            else seconds++;

            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }
    }
}
package com.javarush.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;

/* 
Обратный отсчет
1. Разберись, что делает программа.
2. Реализуй логику метода printCountdown так, чтобы программа каждые полсекунды выводила объект из переменной list. 
Выводить нужно в обратном порядке — от переданного в Countdown индекса до нуля.
*/

public class Solution {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            //add your code here - добавь код тут

     //       for (int i = countFrom-1; i>=0; i--){
            Thread.sleep(500);
            countFrom--;
                System.out.println(list.get(countFrom));

            }
        }
    }

package com.javarush.task.task16.task1615;

/* 
Аэропорт
1. Разберись, что делает программа.
2. Исправь метод takingOff(взлет) — сейчас он работает оооочень долго. Взлет должен занимать 100 миллисекунд.
3. Реализуй метод waiting по аналогии с методом takingOff. Время ожидания не должно превышать время взлета.
*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   //1 взлетная полоса

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Самолет #1");
        Plane plane2 = new Plane("Самолет #2");
        Plane plane3 = new Plane("Самолет #3");
    }

    private static void waiting() {
        //add your code here - добавь код тут
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    private static void takingOff() {
        //fix this method - исправь этот метод
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean isAlreadyTakenOff = false;
            while (!isAlreadyTakenOff) {
                if (RUNWAY.trySetTakingOffPlane(this)) {    //если взлетная полоса свободна, занимаем ее
                    System.out.println(getName() + " взлетает");
                    takingOff();//взлетает
                    System.out.println(getName() + " уже в небе");
                    isAlreadyTakenOff = true;
                    RUNWAY.setTakingOffPlane(null);
                } else if (!this.equals(RUNWAY.getTakingOffPlane())) {  //если взлетная полоса занята самолетом
                    System.out.println(getName() + " ожидает");
                    waiting(); //ожидает
                }
            }
        }
    }

    public static class Runway { //взлетная полоса
        private Thread t;

        public Thread getTakingOffPlane() {
            return t;
        }

        public void setTakingOffPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetTakingOffPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

package com.javarush.task.task16.task1616;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Считаем секунды
1. Напиши реализацию метода run в нити Stopwatch (секундомер).
2. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
3. Выведи количество секунд в консоль.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                //add your code here - добавьте код тут
                seconds =0;
                while (true){
                    seconds++;
                    Thread.sleep(1000);}

            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}

package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].

Пример для countSeconds=4 :
«4 3 2 1 Прервано!»

4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 :
«3 2 1 Марш!»

PS: метод sleep выбрасывает InterruptedException.
*/

import java.util.Date;

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {

            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
            Date d = new Date();
            long date = d.getTime();
            System.out.print(countSeconds+" ");
            while (true){
                Thread.currentThread().sleep(1000);
            countSeconds--;
                long date2 = new Date().getTime();

                System.out.print(countSeconds+" ");
            long df = date2-date;
            if (df>3500) {
                System.out.print("Прервано!");break;
            }
            if (countSeconds==1) {
                Thread.currentThread().sleep(1000);
                System.out.println("Марш!");
            }
                if (countSeconds<=1) break;}
        }catch (Exception e){
                System.out.print("Прервано!");}
        }
    }
}

package com.javarush.task.task16.task1619;

/* 
А без interrupt слабо?
Разберись, как работает программа.
Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.hasInt = true;
    }

    public static class TestThread implements Runnable {
        static volatile boolean  hasInt = false;
        public void run() {
            while (!hasInt) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
package com.javarush.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
Один для всех, все - для одного
1. Разберись, как работает программа.
1.1. Обрати внимание, что объект Water — один для всех нитей.
2. Реализуй метод ourInterruptMethod, чтобы он прерывал все нити из threads.
3. В методе run исправь значения переменных:
3.1. isCurrentThreadInterrupted — должна равняться значению метода isInterrupted у текущей нити.
3.2. threadName — должна равняться значению метода getName (реализовано в классе Thread) у текущей нити.
*/

public class Solution {
    public static byte countThreads = 3;
    static List<Thread> threads = new ArrayList<Thread>(countThreads);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        //add your code here - добавь код тут
        for (int i = 0; i < countThreads; i++) {
            threads.get(i).interrupt();
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < countThreads; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < countThreads; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String commonResource;

        public Water(String commonResource) {
            this.commonResource = commonResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + commonResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
package com.javarush.task.task16.task1621;

/* 
Thread.currentThread - всегда возвращает текущую нить
1. В методе printMsg присвой переменной t текущую нить.
2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("name=" + name);
            //add sleep here - добавь sleep тут
            try {
                Thread.sleep (1);
            } catch (Exception e) {e.printStackTrace();}

        }
    }
}
package com.javarush.task.task16.task1622;

/* 
Последовательные выполнения нитей
1. В методе run после всех действий поставь задержку в 10 миллисекунд. Выведи «Нить прервана«, если нить будет прервана.
2. Сделай так, чтобы все нити выполнялись последовательно: сначала для нити №1 отсчет с COUNT до 1, потом для нити №2 с COUNT до 1 и т.д.
*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDownIndex == 0) return;
                //напишите тут ваш код
                try {
                    Thread.currentThread().sleep(10);
                } catch (InterruptedException e ) {
                    System.out.println("Нить прервана");
                }

            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}

package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
1. Измени класс GenerateThread так, чтобы он стал нитью.
2. Создай конструктор GenerateThread, который должен:
2.1. Вызвать конструктор суперкласса с параметром String — номером созданной нити. Используй countCreatedThreads.
2.2. Запустить текущую нить.
2.3. Номер первой нити должен начинается с 1.
3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods. Начни печатать toString.
3.1. Метод toString должен возвращать № текущей нити и слово « created«. Используй getName().

Пример: «8 created»

4. Пока количество созданных нитей меньше Solution.count метод run должен:
4.1. Создавать новую нить типа GenerateThread.
4.2. Выводить в консоль созданную в пункте 4.1. нить.
5. В итоге должно быть выведено в консоль 15 строк.
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
   //         while (countCreatedThreads<=count) {
                start();
   //         }
    //        countCreatedThreads++;
        }
//
        @Override
        public void run() {
            if (countCreatedThreads<Solution.count) {
                System.out.println(new GenerateThread());
            }
                    }

        @Override
        public String toString() {
            return "" + getName()+" created";
        }
    }
}

package com.javarush.task.task16.task1626;

/*
Разберись, как работает программа.
По образу и подобию CountDownRunnable создай нить CountUpRunnable, которая выводит значения в нормальном порядке — от 1 до number.
 */
public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        //Add your code here - добавь код тут
        private int countUpRunnable = 0;

        public void run() {
            try {
                while (true) {
                    Thread.sleep(500);
                    countUpRunnable += 1;
                    System.out.println(toString());

                    if (countUpRunnable == 5) return;

                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpRunnable;
        }
    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}

package com.javarush.task.task16.task1627;

/* Поиграем?
Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name) и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.
Итак…
1. Разберись, что делает программа.
1.1. List<String> steps хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
1.2. isWinnerFound показывает, найден победитель или нет.
1.3. Метод sleep выбрасывает InterruptedException и принимает параметр типа long.
1.4. Игроки играют независимо друг от друга.
2. Реализуй логику метода run так, чтобы для каждого игрока:
2.1. Через равные интервалы времени (1000ms / rating) выводились в консоль действия, описанные в steps.
2.2. Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.

Пример: [Ivanov:Начало игры].

2.3. Когда игрок выполнит все действия из steps, то он считается победителем. Выведите [getName() + «:победитель!»].
2.4. Когда найден победитель, то игра останавливается, и остальные игроки считаются побежденными. Выведите для них [getName() + «:проиграл»].
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }


        @Override
        public void run() {
            //Add your code here - добавь код тут
    //        int i = 1;
            try {
                for (int i = 0; i < OnlineGame.steps.size(); i++) {
                    Thread.sleep(1000 / rating);
                    System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                }
            } catch (InterruptedException e ) {
                System.out.println(this.getName()+":проиграл");}

            if (!OnlineGame.isWinnerFound){
                System.out.println(this.getName() + ":победитель!");
                OnlineGame.isWinnerFound = true;


//            for (String s : OnlineGame.steps
//                 ) {
//                try {
//                    Thread.sleep(1000/rating);
//                    System.out.println(OnlineGame.currentThread().getName()+":"+s);
//                    if (!OnlineGame.isWinnerFound){
//                        System.out.println(this.getName() + ":победитель!");
//                        OnlineGame.isWinnerFound = true;
//                    }
//                } catch (InterruptedException e ) {
//                    System.out.println(this.getName()+":проиграл");
//                    break;
//                }
//            }
        }
    }
} }

package com.javarush.task.task16.task1628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/*
Кто первый встал - того и тапки
1. Разберись, что делает программа.
1.1. Каждая нить должна читать с консоли слова. Используй готовый static BufferedReader reader.
1.2. Используй AtomicInteger countReadStrings, чтобы посчитать, сколько слов уже считано с консоли всеми нитями.
2. Реализуй логику метода run:
2.1. Пока нить не прервана (!isInterrupted) читай с консоли слова и добавляй их в поле List<String> result.
2.2. Используй countReadStrings для подсчета уже считанных с консоли слов.
 */
public class Solution {
    public static volatile AtomicInteger countReadStrings = new AtomicInteger(0);
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //read count of strings
        int count = Integer.parseInt(reader.readLine());

        //init threads
        ReaderThread consolReader1 = new ReaderThread();
        ReaderThread consolReader2 = new ReaderThread();
        ReaderThread consolReader3 = new ReaderThread();

        consolReader1.start();
        consolReader2.start();
        consolReader3.start();

        while (count > countReadStrings.get()) {
        }

        consolReader1.interrupt();
        consolReader2.interrupt();
        consolReader3.interrupt();
        System.out.println("#1:" + consolReader1);
        System.out.println("#2:" + consolReader2);
        System.out.println("#3:" + consolReader3);

        reader.close();
    }

    public static class ReaderThread extends Thread {
        private List<String> result = new ArrayList<String>();

        public void run() {
            //add your code here - добавьте код тут
            try {
                while (!isInterrupted()){
                    while(reader.ready())
                 {
                    String s = Solution.reader.readLine();
                    result.add(s);
                    countReadStrings.incrementAndGet();
                 }
                 }
            }
            catch (Exception e) {
                return;}

        }

        @Override
        public String toString() {
            return result.toString();
        }
    }
}
package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Только по-очереди!
1. В классе Solution создать public static класс нити Read3Strings унаследовавшись от Thread.
2. В методе run реализовать чтение с консоли трех строк.
3. Три подряд введенных строки должны считываться в одной нити и объединяться в одну строку через пробел.
4. В методе main вывести результат для каждой нити.
5. Используй join.
 */

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private String result;
        @Override
        public void run() {
            try {
                String s1 = reader.readLine();
                String s2 = reader.readLine();
                String s3 = reader.readLine();
                result = s1 + " "+s2+" "+" "+s3;

            } catch (Exception e ) {e.printStackTrace();}
        }
        public void   printResult () {
            System.out.println(result);
        }
    }
}

package com.javarush.task.task16.task1630;
/*
Последовательный вывод файлов
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит — Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.
 */

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = b.readLine();
            secondFileName = b.readLine();
            b.close();
        } catch (Exception e) {e.printStackTrace();}

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();


        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements  ReadFileInterface {
        private String fullFileName;
        private ArrayList <String> list = new ArrayList();

        @Override
        public void run() {
            try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fullFileName)));
            String s;
            while (br.ready()) {s=br.readLine();
                list.add(s);
            }
            br.close();
                } catch (Exception e ) {e.printStackTrace();}
         }

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            String result = "";
            for (String s:  list
                 ) {
                result= result+s+" ";
            }

            return result;
        }
    }
}

package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Serge on 10.09.2017.
 * Factory method pattern
 *1. Внимательно посмотри, какие классы у тебя есть.
* 2. В отдельных файлах в пакете common создай классы JpgReader, PngReader, BmpReader, которые реализуют интерфейс ImageReader.
* 3. В отдельном файле в основном пакете создай класс ImageReaderFactory с одним методом.
* 3.1. Подумай, как он должен называться.
* 3.2. Подумай, какие модификаторы должны быть у этого метода.
* 4. Этот метод должен:
* 4.1. Для каждого значения из ImageTypes возвращать соответствующий Reader, например, для ImageTypes.JPG — JpgReader;
* 4.2. Если передан неправильный параметр, то выбрасывать исключение IllegalArgumentException(«Неизвестный тип картинки«).
 */
public class ImageReaderFactory {
     public static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException{
        ImageReader ir = null;
            if (imageTypes==ImageTypes.BMP) return new BmpReader();
            else if (imageTypes==ImageTypes.JPG) return new JpgReader();
            else if (imageTypes==ImageTypes.PNG) return new PngReader();
            else throw new IllegalArgumentException();
    }
}

package com.javarush.task.task16.task1632;
/*
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить «InterruptedException» при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить «Ура«;
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово «N«, а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new t1());
        threads.add(new t2());
        threads.add(new t3());
        threads.add(new t4());
        threads.add(new t5());
    }

    public static void main(String[] args) {

    }

    public static class t1 extends Thread {
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class t2 extends Thread {
        @Override
        public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        }
    }
    public static class t3 extends Thread {
        @Override
        public void run() {
            try {
                while (true){

                    System.out.println("Ура");
                    Thread.currentThread().sleep(500);
                }
            }catch (Exception e) {e.printStackTrace();}

        }
    }
    public static class t4 extends Thread implements Message{
        @Override
        public void run() {

        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class t5 extends Thread {
        @Override
        public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int k = 0;
        try {
            String n = br.readLine();
            while (!n.equals("N")) {
                i = Integer.parseInt(n);
                k=k+i;
                n = br.readLine();
            }
            System.out.println(k);
        }catch (Exception e) {e.printStackTrace();}
        }
    }

}
package com.javarush.task.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз (index = 0-999) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + «-Note» + index], например, при index=4
«Thread-0-Note4»
2.2. Используя метод removeNote удалит заметку
2.3. В качестве параметра в removeNote передай имя нити — метод getName()
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {

        public static final List<String> notes = new ArrayList<String>();

        public static void addNote(String note) {

            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            }
        }
    }

    public  static class NoteThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i<1000;i++){
                Note.addNote(this.getName()+"-Note"+i);
                Note.removeNote(this.getName());
            }

        }
    }
}

package com.javarush.task.task17.task1702;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Вместе быстрее? Ща проверим :)
1. Разберись, что и как работает.
2. Создай public static нить SortThread, которая в методе run отсортирует статический массив testArray используя метод sort.
*/

public class Solution {
    public static int countThreads = 10;
    public static int[] testArray = new int[1000];

    static {
        for (int i = 0; i < Solution.testArray.length; i++) {
            testArray[i] = i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuffer expectedResult = new StringBuffer();
        for (int i = 1000 - 1; i >= 0; i--) {
            expectedResult.append(i).append(" ");
        }

        initThreads();

        StringBuffer result = new StringBuffer();
        for (int i = 0; i < testArray.length; i++) {
            result.append(testArray[i]).append(" ");
        }
        System.out.println(result);
        System.out.println((result.toString()).equals(expectedResult.toString()));
    }

    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<Thread>(countThreads);
        for (int i = 0; i < countThreads; i++) threads.add(new SortThread());
        for (Thread thread : threads) thread.start();
        for (Thread thread : threads) thread.join();
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }
    public static class SortThread extends Thread{
        @Override
        public void run() {
            sort(testArray);
        }
    }
}

package com.javarush.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки
1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final  List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
           System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
               synchronized (notes){ notes.add(index, note);}
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
             System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.get(index);
                synchronized (notes){  note = notes.remove(index);}
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}
package com.javarush.task.task17.task1706;
/*Синхронизированный президент
И снова Singleton паттерн — синхронизация в статическом блоке
Внутри класса OurPresident в статическом блоке создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте president.
 */

public class OurPresident {
    private static OurPresident president;
    static {
        synchronized (OurPresident.class){

            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {

        return president;
    }
}
package com.javarush.task.task17.task1707;
/*
МВФ
Singleton паттерн — синхронизация в методе.
Класс IMF — это Международный Валютный Фонд.
Внутри метода getFund создайте синхронизированный блок.
Внутри синхронизированного блока инициализируйте поле imf так, чтобы метод getFund всегда возвращал один и тот же объект.
 */

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null) imf =new IMF();
        }
        return imf;
    }

    private IMF() {
    }
}

package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name — имя, String
sex — пол, «м» или «ж», одна буква
bd — дата рождения в следующем формате 15/04/1990
-c — добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u — обновляет данные человека с данным id
-d — производит логическое удаление человека с id, заменяет все его данные на null
-i — выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
id соответствует индексу в списке

Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
   //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
    //        String s = br.readLine();
     //       String[] param = s.split(" ");
            String[] param = args;
                    String[] date = null;
            switch (param[0]) {
                case ("-c"): {
                    date = param[3].split("/");
                    Date bd = new Date(Integer.parseInt(date[2])-1900,Integer.parseInt(date[1])-1,Integer.parseInt(date[0]));
                   Person p = param[2].equals("ж")?Person.createFemale(param[1],bd):Person.createMale(param[1],bd);
                    allPeople.add(p);
                    System.out.println(allPeople.size()-1);

                    SimpleDateFormat d = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
//                    System.out.println(p.getName()+" "+
//                            (p.getSex().equals(Sex.FEMALE)?"ж":"м")+
//                            " "+d.format(p.getBirthDay()));
                    break;
                }

                case ("-u"): {
                    Person set =allPeople.get(Integer.parseInt(param[1]));
                    set.setName(param[2]);
                    if (param[3].equals("ж")){
                        set.setSex(Sex.FEMALE); }
                    else set.setSex(Sex.MALE);
                    date = param[4].split("/");
                    Date bd = new Date(Integer.parseInt(date[2])-1900,Integer.parseInt(date[1])-1,Integer.parseInt(date[0]));
                    set.setBirthDay(bd);

//                    SimpleDateFormat d = new SimpleDateFormat("dd-MMM-YYYY", Locale.ENGLISH);
//                    System.out.println(set.getName()+" "+
//                            (set.getSex().equals(Sex.FEMALE)?"ж":"м")+
//                            " "+d.format(set.getBirthDay()));
                    break;}
                case ("-d"): {Person d =allPeople.get(Integer.parseInt(param[1]));
                    d.setSex(null);
                    d.setName(null);
                    d.setBirthDay(null);
                    break;}
                case ("-i"): {
                    Person p = allPeople.get(Integer.parseInt(param[1]));
                    SimpleDateFormat d = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    System.out.println(p.getName()+" "+
                            (p.getSex().equals(Sex.FEMALE)?"ж":"м")+
                            " "+d.format(p.getBirthDay()));
                    break;}
            }


        }catch (Exception e){e.printStackTrace();}
    }
}

package com.javarush.task.task18.task1803;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        String file = buf.readLine();
        buf.close();
        FileInputStream f = new FileInputStream(file);
        int num;
        HashMap <Integer, Integer> map = new HashMap();
        while (f.available()>0){
            num = f.read();
            int frequent = 0;
            if (!map.containsKey(num)) {
                map.put(num, ++frequent);
            } else {
                frequent = map.get(num);
                frequent = ++frequent;
                map.put(num, frequent);
            }
        }
        f.close();
        int max = 0;
        int num2 = 0;
        for (HashMap.Entry entry : map.entrySet()
             ) {
            if ((int)entry.getValue()>max){
            max = (int)entry.getValue();
            num2 = (int)entry.getKey();}
        }

        for (HashMap.Entry entry : map.entrySet()
             ) {
            if ((int)entry.getValue()==(max))
            System.out.print(entry.getKey()+" ");
        }
    }
}


package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        String file = buf.readLine();
        buf.close();
        FileInputStream f = new FileInputStream(file);

        int num;
        HashMap<Integer, Integer> map = new HashMap();
        while (f.available()>0){
            num = f.read();
            int frequent = 0;
            if (!map.containsKey(num)) {
                map.put(num, ++frequent);
            } else {
                frequent = map.get(num);
                frequent = ++frequent;
                map.put(num, frequent);
            }

        }
        f.close();
        int min = Integer.MAX_VALUE;
        int num2 = 0;
        for (HashMap.Entry entry : map.entrySet()
                ) {
            if ((int)entry.getValue()<min){
                min = (int)entry.getValue();
                num2 = (int)entry.getKey();}

        }

        for (HashMap.Entry entry : map.entrySet()
                ) {
            if ((int)entry.getValue()==(min))
                System.out.print(entry.getKey()+" ");

        }

    }
}

package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре — используйте метод toUpperCase().
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface{
        private ATableInterface component;
       private String HeaderText;

        public TableInterfaceWrapper(ATableInterface component) {
            this.component = component;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            component.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return component.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            component.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}


package com.javarush.task.task18.task1816;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
        try {
            String name = args[0];
            FileInputStream stream = new FileInputStream( name);
            int i = 0;
            int c = 0;
            while (stream.available()>0) {
                c = stream.read();
                if (c >= 97 && c <= 122 || c >= 65 && c <= 90)
                    i++;
            }
            System.out.println(i);
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.
*/

import java.io.FileInputStream;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
    String file = args[0];
    float probel = 0;
    float vse = 0;
    int c = 0;
        try {
            FileInputStream stream = new FileInputStream(file);
            while (stream.available()>0){
                c = stream.read();
                if (c == 32) probel++;
                vse++;
            }
            float pr = probel/vse*100;
            System.out.println(String.format(new Locale("ru"),"%(.2f",pr));
            stream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String file1 = buf.readLine();
            String file2 = buf.readLine();
            String file3 = buf.readLine();
            FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            FileInputStream fileInputStream3 = new FileInputStream(file3);
            while (fileInputStream2.available()>0) {
                fileOutputStream1.write(fileInputStream2.read());
            }
            while (fileInputStream3.available()>0) {
                fileOutputStream1.write(fileInputStream3.read());
            }
            buf.close();
            fileOutputStream1.close();
            fileInputStream2.close();
            fileInputStream3.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;

        try {
            file1 = buf.readLine();
            file2 = buf.readLine();
            FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
            FileInputStream fileInputStream1 = new FileInputStream(file1);
            FileInputStream fileInputStream2 = new FileInputStream(file2);

           byte[] buffer = new byte[fileInputStream1.available()];
            int cap = 0;
            while (fileInputStream1.available()>0) {
                cap = fileInputStream1.read(buffer);

            }
//            File myFile = new File(file1);
//            if (myFile.exists()) {
//                myFile.delete();
//                myFile.createNewFile(new File(file1));
//            }
            while (fileInputStream2.available()>0) {
                fileOutputStream1.write(fileInputStream2.read());
            }
            fileOutputStream1 = new FileOutputStream(file1,true);
            fileOutputStream1.write(buffer);
            fileOutputStream1.close();
            fileInputStream2.close();
            fileInputStream1.close();
            buf.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


package com.javarush.task.task18.task1820;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String filename1 = cin.readLine();
            String filename2 = cin.readLine();
            FileInputStream fin = new FileInputStream(filename1);
            FileOutputStream fout = new FileOutputStream(filename2);
            StringBuilder str = new StringBuilder();
            while (fin.available() > 0) {
                str.append(Character.toChars(fin.read()));
            }
            String[] numbers = str.toString().split(" ");
            for (int i = 0; i < numbers.length; i++) {
                int digit = Math.round(Float.parseFloat(numbers[i]));
                fout.write(Integer.toString(digit).getBytes());
                fout.write(32);
            }
            fin.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром — именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
‘,’=44, ‘s’=115, ‘t’=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        try {
            FileInputStream stream = new FileInputStream(args[0]);
            HashMap <Character,Integer> map = new HashMap();
            int i = 1;
            while (stream.available()>0){

                Character c =(char) stream.read();
                if (map.isEmpty()) {
                map.put(c,i);}
                else if (!map.containsKey(c)) {
                    map.put(c,i);
                } else if (map.containsKey(c)) {
                    int j = map.get(c);
                    map.put(c,++j);

                }
            }
            ArrayList <Character> list =new ArrayList();
            for (Character c : map.keySet()
                 ) {
                list.add(c);
            }
            Collections.sort(list);
            for (Character c: list
                 ) {
                System.out.println(c+" "+ map.get(c));
            }

        stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово «exit«.
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String — это имя файла, параметр Integer — это искомый байт.
Закрыть потоки.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String e = "exit";
        try {
            String name = buf.readLine();
            while (!name.equals(e)){
                ReadThread thread = new ReadThread(name);
                thread.start();
                name = buf.readLine();
            }
        buf.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
       private FileInputStream  f ;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                f = new FileInputStream(fileName);
                int num;
                HashMap <Integer, Integer> map = new HashMap();
                while (f.available()>0){
                    num = f.read();
                    int frequent = 0;
                    if (!map.containsKey(num)) {
                        map.put(num, ++frequent);
                    } else {
                        frequent = map.get(num);
                        frequent = ++frequent;
                        map.put(num, frequent);
                    }
                }
                f.close();
                int max = 0;
                int num2 = 0;
                for (HashMap.Entry entry : map.entrySet()
                        ) {
                    if ((int)entry.getValue()>max){
                        max = (int)entry.getValue();
                        num2 = (int)entry.getKey();}
                }
                resultMap.put(fileName,num2);

            } catch (Exception e) {
                e.printStackTrace();
                try {
                    f.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}


package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = null;
        FileInputStream input = null;
        for (; true; ) {
            file = reader.readLine();
            try {
                input = new FileInputStream(file);
                input.close();
            } catch (FileNotFoundException fne) {
                System.out.println(file);
                break;
            }
        }
    }
}
package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений — отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(bufferedReader.readLine());
        TreeSet <Integer> set = new TreeSet();
        while (stream.available()>0){
            set.add(stream.read());
        }
        for (Integer i: set
             ) {
            System.out.print(i+" ");
        }
        bufferedReader.close();
        stream.close();
    }
}

package com.javarush.task.task19.task1906;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным индексом.

Пример:
второй символ, четвертый символ, шестой символ и т.д.

Закрыть потоки ввода-вывод
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();
            FileReader reader = new FileReader(file1);
            FileWriter writer = new FileWriter(file2);
            int i = 0;
            while (reader.ready()){
                int c = reader.read();
                i++;
                if (i%2==0) {
                    writer.write(c);
                }
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов «world«, которые встречаются в файле.
Закрыть потоки.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String file1 = bufferedReader.readLine();
            bufferedReader.close();
   //         BufferedReader buff = new BufferedReader(new FileReader(file1));
            FileReader buff = new FileReader(file1);
            Pattern pattern = Pattern.compile("\\bworld\\b");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(" ");
            int i = 0;
            while (buff.ready()){
                int c = buff.read();
                stringBuffer.append((char)c);
                }
            Matcher matcher = pattern.matcher(stringBuffer);
          while (matcher.find()){
                i++;
            }

            buff.close();
            System.out.println(i);


           } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        try {
            String file = bufferedReader.readLine();
            String file2 = bufferedReader.readLine();
            bufferedReader.close();
            bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
            while (bufferedReader.ready()){
                String s = bufferedReader.readLine();
                String[] array = s.split("\\s");
                for (int i = 0; i < array.length; i++){
                    if (array[i].matches("[+-]?\\d+")){
                        writer.write(array[i]+" ");
                    }
                }
            }

            bufferedReader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.javarush.task.task19.task1911;

/* 
Ридер обертка
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

            PrintStream consoleStream = System.out;
            ByteArrayOutputStream byt = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(byt);
            System.setOut(stream);
            testString.printSomething();
        String out = byt.toString();
            System.setOut(consoleStream);
        System.out.println(out.toUpperCase());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
В методе main подмените объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна заменять все подстроки «te» на «??«.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byt = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byt);
        System.setOut(stream);
        testString.printSomething();
        String out = byt.toString().replaceAll("te","??");
        System.setOut(consoleStream);

        System.out.println(out);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить только цифры.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byt = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byt);
        System.setOut(stream);
        testString.printSomething();
        String out = byt.toString().replaceAll("\\D","");
        System.setOut(consoleStream);

        System.out.println(out);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}

package com.javarush.task.task19.task1914;

/* 
Решаем пример
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна выводить на консоль решенный пример.
Вызови готовый метод printSomething(), воспользуйтесь testString.
Верни переменной System.out первоначальный поток.

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов — нет.
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byt = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byt);
        System.setOut(stream);
        testString.printSomething();
        String out = byt.toString();
        String[] result = out.split(" ");
        int x = Integer.parseInt(result[0]);
        int y = Integer.parseInt(result[2]);
        int z = 0;
        switch (result[1]) {
            case "+": z = x + y; break;
            case "-": z = x - y; break;
            case "*": z = x * y; break;
        }
        System.setOut(consoleStream);

        System.out.print(x + " " + result[1] + " " + y + " = " + z);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

package com.javarush.task.task19.task1915;

/* 
Дублируем текст
Считай с консоли имя файла.
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна дублировать вывод всего текста в файл, имя которого ты считал.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Закрой поток файла.
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String file = reader.readLine();
            reader.close();
            FileOutputStream writer = new FileOutputStream(file);
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            PrintStream stream = new PrintStream(byteStream);
            PrintStream consoleStream = System.out;
            System.setOut(stream);
            testString.printSomething();
            String result = byteStream.toString();
            System.setOut(consoleStream);
            
            writer.write(byteStream.toByteArray());
            System.out.println(result);
            
            byteStream.close();
            writer.close();
            stream.close();
            consoleStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Отслеживаем изменения
Считать с консоли 2 имени файла — file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines.
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME.
В оригинальном и редактируемом файлах пустых строк нет.
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            String file1 = buf.readLine();
            String file2 = buf.readLine();
            buf.close();
            FileReader reader1 = new FileReader(file1);
            FileReader reader2 = new FileReader(file2);
            BufferedReader sc1 = new BufferedReader(reader1);
            BufferedReader sc2 = new BufferedReader(reader2);
            String string1 = sc1.readLine();
            String string2 = sc2.readLine();
            String string11 = string1;
            String string22 = string2;
            while (!string1.isEmpty() || !(string2.isEmpty())) {

                if (string1.equals(string2)) {
                    lines.add(new LineItem(Type.SAME, string1));
                    if (!sc1.ready() && !sc2.ready()) break;
                    string1 = sc1.readLine();
                    string2 = sc2.readLine();
                    string11 = string1;
                    string22 = string2;
                } else {
                    if (sc1.ready()) {
                        try {
                            string1 = sc1.readLine();
                        } catch (NullPointerException e) {
                            string1 = "";
                        }
                    }
                    if ((string1.equals(string2))) {
                        lines.add(new LineItem(Type.REMOVED, string11));
                    } else {
                        lines.add(new LineItem(Type.ADDED, string2));
                        lines.add(new LineItem(Type.SAME, string11));

                        string2 = sc2.readLine();
                        string2 = sc2.readLine();
                    }
                }

            if (!sc1.ready() || !sc2.ready()) {
                if (!sc1.ready() && !sc2.ready()) {
                    if (string1.equals(string2)){
                        lines.add(new LineItem(Type.SAME, string1));}
                    else if (!string1.isEmpty()) lines.add(new LineItem(Type.REMOVED, string1));
                    else  {lines.add(new LineItem(Type.ADDED, string2)); break;}
                    }

                    if (string1.equals(string2) && sc1.ready()){
                        lines.add(new LineItem(Type.SAME, string1));
                     if (!string1.isEmpty() && sc1.ready()) {
                         string1 = sc1.readLine();
                        lines.add(new LineItem(Type.REMOVED, string1));
                        while (sc1.ready() || !string1.isEmpty()) {
                            if (!string1.isEmpty()) break;
                            string1 = sc1.readLine();
                            lines.add(new LineItem(Type.REMOVED, string1));
                        }}
                        break;
                    }
                    if (string1.equals(string2) && sc2.ready()){
                        lines.add(new LineItem(Type.SAME, string1));
                        if (!string2.isEmpty() && sc2.ready()) {
                            string2 = sc2.readLine();
                        lines.add(new LineItem(Type.ADDED, string2));
                        while (sc2.ready() || !string2.isEmpty()) {
                            if (!string2.isEmpty()) break;
                            string2 = sc2.readLine();
                            lines.add(new LineItem(Type.ADDED, string2));
                        }}
                        break;
                    }
                    break;
                }
            }

            reader1.close();
            reader2.close();
            sc1.close();
            sc2.close();
//            for (LineItem l: lines
//                 ) {
//                System.out.println( l.type+ " "+l.line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
Реализовать логику FileConsoleWriter.
Класс FileConsoleWriter должен содержать приватное поле FileWriter fileWriter.
Класс FileConsoleWriter должен содержать все конструкторы, которые инициализируют fileWriter для записи.
Класс FileConsoleWriter должен содержать пять методов write и один метод close:

public void write(char[] cbuf, int off, int len) throws IOException
public void write(int c) throws IOException
public void write(String str) throws IOException
public void write(String str, int off, int len)
public void write(char[] cbuf) throws IOException
public void close() throws IOException
При записи данных в файл, должен дублировать эти данные на консоль.
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public static void main(String[] args) {
    }

    public FileConsoleWriter(String fileName) throws IOException{
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException{
        fileWriter = new FileWriter( fileName,  append);
    }

    public FileConsoleWriter(File file) throws IOException{
        fileWriter = new FileWriter( file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException{
        fileWriter = new FileWriter( file, append);
    }
    public FileConsoleWriter(FileDescriptor fd) throws IOException{
        fileWriter = new FileWriter(fd);
    }
    public void write(char[] cbuf, int off, int len) throws IOException{
        fileWriter.write(cbuf,off,len);
        System.out.print(new String(cbuf, off, len));
    }

    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.println(c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len)throws IOException{
        fileWriter.write(str, off, len);
        System.out.print(String.valueOf(str.substring(off, off+len)));

    }

    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        System.out.println(cbuf);
    }

    public void close() throws IOException{
        fileWriter.close();
    }
}


package com.javarush.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Читаем и пишем в файл: Human
Реализуй логику записи в файл и чтения из файла для класса Human.
Поле name в классе Human не может быть пустым.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null,new File("C:\\Idea\\JavaRushTasks\\"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

//            Human ivanov = new Human("Ivanov", new Asset("home", 999_999.99), new Asset("car", 2999.99));
            Human ivanov = new Human("Ivanov");
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);

            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            if (somePerson.equals(ivanov)) System.out.println("Это Иванов");
            else System.out.println("Это не Иванов");
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
            e.printStackTrace();
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (!name.isEmpty()) {
                writer.write(name+"\n");
            } else writer.write("null\n");
            if (!assets.isEmpty()){
            for (Asset as : assets
                    ) {
                writer.write(as.getName()+"\n");
                writer.write(Double.toString(as.getPrice())+"\n");
                      }
            } else writer.write("null");
            writer.flush();
            outputStream.close();
            writer.close();
         }


        public void load(InputStream inputStream) throws Exception {
            boolean assetsIs = true;
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            name = reader.readLine();
            if (name.equals("null")) name = null;
            while ( reader.ready() && assetsIs){

                String s = reader.readLine();
                if (s.equals("null")){
 //                   assets = null;
                    assetsIs = false;
                    break;
                }
                double m = Double.parseDouble(reader.readLine());
                Asset as = new Asset(s,m);
                assets.add(as);
            }
            inputStream.close();
            reader.close();
        }
        }
    }
    package com.javarush.task.task20.task2001;

public class Asset {
    public Asset(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Asset asset = (Asset) o;

        if (Double.compare(asset.price, price) != 0) return false;
        return name != null ? name.equals(asset.name) : asset.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File your_file_name = File.createTempFile("your_file_name", null,new File("C:\\Idea\\JavaRushTasks\\temp"));
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("q1");
            user.setLastName("q2");
            user.setBirthDate(new Date(123135151));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();
            if (javaRush.equals(loadedObject)) System.out.println("OK");
            else System.out.println("NOT");

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (!users.isEmpty()) {
                for (User u: users
                     ) {
//                    if (!u.getFirstName().isEmpty())
                        writer.write(u.getFirstName()+"\n");
//                    else writer.write("null"+ "\n");
//                    if (!u.getLastName().isEmpty())
                        writer.write(u.getLastName()+"\n");
//                    else writer.write("null"+ "\n");
//                    if (u.getBirthDate()==null)
                        writer.write(u.getBirthDate().getTime()+"\n");
//                    else writer.write("null"+ "\n");
                    writer.write(u.isMale()? "male" + "\n": "null"+"\n");
//                    if (!(u.getCountry()==null))
                        writer.write(u.getCountry().getDisplayedName()+"\n");
//                    else writer.write("null"+ "\n");
                    outputStream.flush();
                }
            } else writer.write("null");
            outputStream.flush();
  //          outputStream.close();
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while (reader.ready()){

                User u = new User();
                String q1 = reader.readLine();
                if (q1.equals("null")) {
                    break;
                }
                u.setFirstName(q1);

                String q2 = reader.readLine();
 //               if (!q2.equals("null"))
                u.setLastName(q2);

                String q3 = reader.readLine();
  //              if (!q3.equals("null")) {
                    Date date = new Date(Long.parseLong(q3));
  //              }
                u.setBirthDate(date);
                u.setMale(reader.readLine().equals("male"));

                String q5 = reader.readLine();
//                if (!q5.equals("null"))
                switch (q5){
                    case ("Ukraine"): u.setCountry(User.Country.UKRAINE); break;
                    case ("Russia"): u.setCountry(User.Country.RUSSIA);break;
                    case ("Other"): u.setCountry(User.Country.OTHER);break;
                }
                this.users.add(u);
            }

//            inputStream.close();
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
package com.javarush.task.task20.task2002;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private boolean isMale;
    private Country country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public static enum Country {
        UKRAINE("Ukraine"),
        RUSSIA("Russia"),
        OTHER("Other");

        private String name;

        private Country(String name) {
            this.name = name;
        }

        public String getDisplayedName() {
            return this.name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isMale != user.isMale) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        if (birthDate != null ? !birthDate.equals(user.birthDate) : user.birthDate != null) return false;
        return country == user.country;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (isMale ? 1 : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}

