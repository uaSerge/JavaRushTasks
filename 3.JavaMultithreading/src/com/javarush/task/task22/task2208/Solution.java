package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
Сформируй часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{name=Ivanov, country=Ukraine, city=Kiev, age=null}

Результат:
name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'


Требования:
1. Метод getQuery должен принимать один параметр типа Map.
2. Метод getQuery должен иметь тип возвращаемого значения String.
3. Метод getQuery должен быть статическим.
4. Метод getQuery должен возвращать строку сформированную по правилам описанным в условии задачи.
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
//        map.put("name","Ivanov");
//        map.put("country","Ukraine");
        map.put("city",null);
        map.put("age",null);
//        map.put("name1","Ivanov");
//        map.put("name2","Ivanov");

        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {

        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();
        params.forEach((k,v) -> {
            if (v != null && k != null) result.append(k).append(" = '").append(v).append("'").append(" and ");
        });

        if (new String(result).length()>4)result.delete(result.lastIndexOf(" and "),result.lastIndexOf(" "));
        return new String(result).trim();
    }
}
