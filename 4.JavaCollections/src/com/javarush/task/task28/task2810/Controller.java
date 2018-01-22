package com.javarush.task.task28.task2810;

import com.javarush.task.task28.task2810.model.Model;
import com.javarush.task.task28.task2810.model.Provider;
import com.javarush.task.task28.task2810.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Controller {
//    private Provider [] providers;
    Model model;

    public Controller(Model model) {
        if (model ==(null)) throw new IllegalArgumentException();
//        this.providers = providers;
        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }
//    @Override
//    public String toString() {
//        return "Controller{" +
//                "providers=" + Arrays.toString(providers) +
//                '}';
//    }

//    public void scan()  {
//        ArrayList <Vacancy> list = new ArrayList();
//        try {
//            for (int i = 0; i < providers.length; i++)
//                    list.addAll(providers[i].getJavaVacancies(""));
//
//
//        } catch (NullPointerException e) {
//
//        }finally {
//            System.out.println(list.size());
//        }
//
//    }
}
