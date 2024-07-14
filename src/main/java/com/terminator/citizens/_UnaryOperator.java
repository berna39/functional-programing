package com.terminator.citizens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class _UnaryOperator {
    
    public static void main(String[] args) {
        // the Function<Integer, Integer> which accepts and returns the same type, can be replaced with UnaryOperator<Integer>
        UnaryOperator<Integer> doubleIt = x -> x * 2;
        final var result = doubleIt.apply(3);
        System.out.println(result);

        // UnaryOperator<Integer> as an argument
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        UnaryOperator<Integer> transformer = x -> x * 2;
        List<Integer> tranformResult = transform(list, transformer);
        System.out.println(tranformResult); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
    }

    public static List<Integer> transform(List<Integer> list, UnaryOperator<Integer> transformer) {
        List<Integer> result = new ArrayList<>();
        for (Integer t : list) {
            result.add(transformer.apply(t));
        }
        return result;
    }
}
