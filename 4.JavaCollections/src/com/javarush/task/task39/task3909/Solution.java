package com.javarush.task.task39.task3909;

import java.util.Arrays;

/*
Одно изменение
Реализуй метод isOneEditAway(String first, String second) который будет возвращать true, если возможно изменить/добавить/удалить один символ в одной из строк и получить другую.

Символы в анализируемой строке ограничены кодировкой ASCII.
Регистр символов учитывается.


Требования:
1. Метод isOneEditAway должен корректно работать для строк одинаковой длины.
2. Метод isOneEditAway должен корректно работать для строк разной длины.
3. Метод isOneEditAway должен корректно работать для пустых строк.
4. Метод isOneEditAway должен быть публичным.
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(isOneEditAway("", "")); // true
        System.out.println(isOneEditAway("", "m")); //true
        System.out.println(isOneEditAway("m", "")); //true
        //System.out.println(isOneEditAway("m", null));
        System.out.println("------");
        System.out.println(isOneEditAway("mama", "ramas")); //false
        System.out.println(isOneEditAway("mamas", "rama")); //false
        System.out.println(isOneEditAway("rama", "raa")); //true
        System.out.println(isOneEditAway("mama", "dama")); //true
        System.out.println(isOneEditAway("ama", "mama"));  //true
        System.out.println(isOneEditAway("123", "1453")); //false
        System.out.println(isOneEditAway("32", "332")); //true
        System.out.println(isOneEditAway("2", "33")); //false
        System.out.println(isOneEditAway("am", "mak"));//false
    }

    public static boolean isOneEditAway(String first, String second) {
        if (first == second) return true;
        if (first == null || second == null) return false;
        if (!((first.length() == second.length()) || first.length() == second.length() + 1
                || first.length() + 1 == second.length())) return false;
        if (first.equals(second)) return true;

        if (first.length() < second.length()) {
            String s = second;
            second = first;
            first = s;
        }
        if (first.length() == 1 && second.length() == 0) return true;
        if (first.length() == second.length()) {
            char[] char1 = first.toCharArray();
            char[] char2 = second.toCharArray();
            int j = 0;
            for (int i = 0; i < first.length(); i++) {
                if (char1[i] != char2[i]) {
                    j++;
                }
            }
            return j == 1;
        }
        if (first.length() == second.length() + 1) {
            char[] char1 = first.toCharArray();
            char[] char2 = second.toCharArray();
            int j = 0;
            for (int i = 0; i < first.length(); i++) {
                if (char1[i] != char2[i]) {
                    j++;
                    if (char2.length == i) return j == 0;
                    if (j > 1) return false;
                    char[] char3 = Arrays.copyOfRange(char2, i, second.length());
                    char[] char4 = Arrays.copyOfRange(char1, i + 1, first.length());
                    if (Arrays.equals(char3, char4)) return true;
                    else return false;
                }
                if (char2.length == i + 1) return j == 0;
            }
            return j == 1 || j == 0;
        }
        return false;
    }

}
