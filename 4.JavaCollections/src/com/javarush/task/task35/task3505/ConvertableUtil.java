package com.javarush.task.task35.task3505;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertableUtil {

    public static <K> Map  convert(List <? extends Convertable<K>> list) {
        Map result = new HashMap();
        for ( Convertable value: list
             ) {
            result.put((K)value.getKey(),value);
        }

        return result;
    }
}
