package com.terminator.citizens;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Imperatif approach
        int inc = increment(12);
        System.out.println(inc);
        
        // Functional approach
        System.out.println(advancedIncrement.apply(9));
    }

    // Represents a function that accepts one argument and produces a result.
    static Function<Integer, Integer> advancedIncrement = number -> number + 1;

    static Integer increment(int i) {
        // return i++; //never do this koz 
        // return always evaluates the whole expression being returned (unless the return statement contains 
        // some short circuited operator such as && and ||, but that's not the case here), but the evaluation of 
        // the post increment operator a++ returns the old value of a.
        return i + 1;
    }
}
