package com.javarush.task.task14.task1408;

/**
 * Created by Serge on 06.09.2017.
 */
public class MoldovanHen extends Hen {
    String country = Country.MOLDOVA;
    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + country + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return s;
    }

    @Override
    int getCountOfEggsPerMonth() {

        return 30;
    }
}
