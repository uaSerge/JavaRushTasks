package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Serge on 17.12.2017.
 */
public class CustomInvocationHandler implements InvocationHandler{
    Object some;

    public CustomInvocationHandler(SomeInterfaceWithMethods s) {
        some = s;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+ " in");
        Object res = method.invoke(some,args);
        System.out.println(method.getName()+ " out");
        return res;
    }
}
