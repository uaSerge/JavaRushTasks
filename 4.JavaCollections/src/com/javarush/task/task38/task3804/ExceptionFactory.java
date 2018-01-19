package com.javarush.task.task38.task3804;

public class ExceptionFactory {

    public static Throwable factory (Enum e){
        if (e == null) return new IllegalArgumentException();

        String s = e.getClass().getSimpleName();
        String message = e.name().charAt(0) + e.name().substring(1).toLowerCase().replace("_", " ");

        if (s.equals(ExceptionApplicationMessage.class.getSimpleName()))
            return new Exception(message);
        if (s.equals(ExceptionDBMessage.class.getSimpleName()))
            return new RuntimeException(message);
        if (s.equals(ExceptionUserMessage.class.getSimpleName()))
            return new Error(message);

        return new IllegalArgumentException();
    }
}
