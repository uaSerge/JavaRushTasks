package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = null;
        try {
            filename = reader.readLine();
            reader.close();
            BufferedReader filereader = new BufferedReader(new FileReader(filename));
            ArrayList <String> list = new ArrayList<>();
 //           Set<Pair> set = new HashSet<>();
            while (filereader.ready()){
                String [] strings = filereader.readLine().split("\\s");
                for (String s: strings
                     ) {
                    list.add(s);
                }
            }
            String first = null;
            String second = null;
            for (int i = 0; i<list.size();i++ ) {
                first = list.get(i);
                if (i != list.size()-1) second = list.get(i + 1);
                else break;
                if (first.equals(new StringBuilder(second).reverse().toString())){

                    Pair p = new Pair();
                    p.first = first;
                    p.second = second;
                    result.add(p);
                    i++;
                    if (i != list.size()-1) second = list.get(i + 1);
                    else break;
            }
            }
            for (Pair pair: result){
//                result.add(pair);
                System.out.println(pair.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
