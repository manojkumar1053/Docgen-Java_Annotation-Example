package com.teamtreehouse.docgen;

import com.teamtreehouse.math.MathUtils;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // TODO: Process the MathUtils class's annotations

        //Get a class object
        Class<?> clazz = MathUtils.class;

        //Get all the declared methods
        Method[] methods = clazz.getMethods();
        Method[] methods1 = clazz.getDeclaredMethods();

        //Loop over method

        System.out.println(" ************* All Methods  ************* ");
        for (Method m : methods) {
            System.out.printf("Name: %s%n", m.getName());
            System.out.printf("\t# params:%s%n", m.getParameterCount());
        }
        System.out.println("--------------------------------------");
        System.out.println("*********Declared Methods************");
        for (Method m1 : methods1) {
            System.out.printf("Name: %s%n", m1.getName());
            System.out.printf("\t# params:%s%n", m1.getParameterCount());
        }


        //Number of params


    }
}