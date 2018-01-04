package com.javarush.task.task36.task3601;

public class View {

    public void fireEventShowData() {
        String s = new Controller().onDataListShow().toString();
        System.out.println(s);
    }

}
