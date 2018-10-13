package com.teamtreehouse.docgen;

import com.teamtreehouse.math.MathUtils;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        DocProcessor.process(MathUtils.class);

    }
}