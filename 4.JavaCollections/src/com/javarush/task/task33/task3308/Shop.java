package com.javarush.task.task33.task3308;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "shop")
@XmlRootElement
public class Shop {
    public Goods goods = new Goods();
    public int count;
    public double profit;
    public String[] secretData;

    //В классе Shop.Goods должен быть создан список строк names.

    public static class Goods {
        public List<String> names = new ArrayList<>();

        @Override
        public String toString() {
            String to = "goods";
            for (String s: names
                 ) {
                to =to +" "+s;
            }
            return to;
        }
    }

    @Override
    public String toString() {
        String to = goods.toString()+" count :" + count + ", profit : "+profit + ", secret : ";
        for (String s: secretData
             ) {
            to = to + " secretData "+s;
        }
        return to;
    }
}