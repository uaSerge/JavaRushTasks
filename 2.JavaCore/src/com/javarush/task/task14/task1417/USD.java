package com.javarush.task.task14.task1417;

/**
 * Created by Serge on 07.09.2017.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
