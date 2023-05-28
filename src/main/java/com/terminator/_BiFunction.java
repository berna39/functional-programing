package com.terminator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _BiFunction {
    public static void main(String[] args) {
        int incremented = incrementByOne.apply(12);
        System.out.println(incremented);

        // In a case we want to increment and multiply by 10
        int multiply = incrementByOne.andThen(multiplyByTen).apply(9); // I can chain functions
        System.out.println(multiply);

        // BiFunction takes 2 inputs instead of one
        System.out.println(incrementAndMultiplyByTen.apply(9, 10)); // the same result using BiFunction
    }

    static Function<Integer, Integer> incrementByOne = (n) -> n + 1;

    static Function<Integer, Integer> multiplyByTen = (n) -> n * 10;

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyByTen = (n, multiplyBy) -> (n + 1) * multiplyBy; 

    // Signature BiFunction<T,U,R>
}
