package com.javarush.task.task39.task3901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Уникальные подстроки
Реализуй метод lengthOfLongestUniqueSubstring таким образом, чтобы он возвращал длину самой длинной подстроки без повторяющихся символов, найденной в строке полученной в качестве параметра.
Например, для строки "a123bcbcqwe" - 6, а для строки "ttttwt" - 2.
Если анализируемая строка пуста или равна null - верни 0.


Требования:
1. Метод lengthOfLongestUniqueSubstring должен возвращать длину подстроки с максимальным количеством уникальных символов.
2. Метод lengthOfLongestUniqueSubstring должен возвращать 0 для пустой строки, или строки равной null.
3. Метод lengthOfLongestUniqueSubstring должен быть публичным.
4. Метод lengthOfLongestUniqueSubstring должен быть статическим.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        char [] chars = s.toCharArray();
        ArrayList <Character> list = new ArrayList();
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        char c4 = 0;
        ArrayList <String> subs = new ArrayList();
        Set <Integer> set = new HashSet();
        for (char c : chars
             ) {
            for (Character c2 : list
                    ) {
                if (c == c2) {
                    String sub = "";
                    for (Character c3 : list
                         ) {
                        sub = sub + c3;
                          }
                    subs.add(sub);
                    c4 = c;
                    c = 0;
                    list = new ArrayList<>();
                    i1 = sub.length();
                    set.add(i1);
                    i2 = 0;
                }
            }
            if (i == 0) subs.add(""+ c);
//            if (i == 1 && subs.contains(c)) subs.remove(c);
            if (!(c==0))list.add(c);
            i++;
            i2++;
            if (!(c4==0)) list.add(c4);
            c4 = 0;
        }
        set.add(i2);
        int max = subs.subList(0,1).size();
        int size = 0;
        for (Integer n : set
             ) {
            size = n;
            if (size>max) max = size;
        }
        return max;
    }
}
