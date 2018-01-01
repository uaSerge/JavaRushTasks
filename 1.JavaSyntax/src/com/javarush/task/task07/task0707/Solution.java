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
