package com.javarush.task.task14.task1408;

/**
 * Created by Serge on 06.09.2017.
 */
public abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription() {
        String s = "Я - курица.";
        return s;
    }
}
