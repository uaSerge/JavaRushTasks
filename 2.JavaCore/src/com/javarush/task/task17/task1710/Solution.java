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
