package com.javarush.task.task39.task3906;

public class LightBulb implements Switchable {
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

//    @Override
//    public void press() {
//        if (!isOn()) turnOn();
//        else turnOff();
//    }

    public void turnOff() {
        System.out.println("The light is shining!");
        on = false;
    }

    public void turnOn() {
        System.out.println("The light has been turned off!");
        on = true;
    }
}
