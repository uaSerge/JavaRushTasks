package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
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
}