package com.javarush.task.task37.task3714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Древний Рим
Амиго, привет! Я недавно увлекся историей вашей планеты и меня заинтересовал период Древнего Рима.
Интересно тогда было жить, сплошные развлечения и вино! Или рабство, если не повезло со стартовой локацией...

В общем, мне нужен метод romanToInteger, который будет конвертировать число в римской системе счисления {I, V, X, L, C, D, M} в десятичную. Иначе никак не разобрать что и когда у них происходило.


Требования:
1. Метод romanToInteger должен конвертировать число в римской системе счисления в десятичную.
2. Метод romanToInteger должен возвращать значение типа int и принимать один параметр типа String.
3. Метод romanToInteger должен быть публичным.
4. Метод romanToInteger должен быть статическим.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input a roman number to be converted to decimal: ");
        String romanString = bufferedReader.readLine();
        System.out.println("Conversion result equals " + romanToInteger(romanString));
    }

    public static int romanToInteger(String s) {
        //2683 MMDCLXXXIII   1000 1000 500 100 50 10 10 10 1 1 1
        //1999 MCMXCIX          1000 100 1000 10 100 1 10
        int[] num = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            num[i] = RomesNum.valueOf(String.valueOf(s.charAt(i))).getValue();
        }
        int res = num[num.length - 1];                 // присваиваем ласт элемент
        for (int i = num.length - 1; i > 0; i--) {              // идем с конца
            if (num[i - 1] >= num[i]) {
                res += num[i - 1];             // если след элемент >= то + к res
            } else {
                res -= num[i - 1];            // или минусуем
            }
        }
        return res;
    }
    public  enum RomesNum {
        M {
            public int getValue () {
            return 1000;
            }
        },
        D{
            public int getValue () {
                return 500;
            }
        },
        C{
            public int getValue () {
                return 100;
            }
        },
        L {
            public int getValue () {
                return 50;
            }
        },
        X {
            public int getValue () {
                return 10;
            }
        },
        I {
            public int getValue () {
                return 1;
            }},
        V {
            public int getValue () {
                return 5;
                }
        };

        abstract int getValue ();
        }
}
