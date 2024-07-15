package com.terminator.scenarios;

import java.util.function.Function;

public class _Currying {
    
    public static void main(String[] args) {
        /*
         *  technique of converting a function that takes multiple arguments
         *  into a sequence of functions that take a single argument.
         * 
         *  Moreover, a curried function does not realize its effect until it 
         *  receives all the arguments.
         */

        // Example 1
        Function<Double, Function<Double, Double>> rectangleArea = height -> width -> height * width;
        Function<Double, Double> setHeightAndWaitForWidth = rectangleArea.apply(10d);
        System.out.println(setHeightAndWaitForWidth.apply(23d));

        // Can do this too
        final var res = rectangleArea.apply(13d).apply(20d);
        System.out.println(res);


        // Example 2
        // using ordinary method
        final var result = addNumbers(1, 2, 3);
        System.out.println(String.format("The addition result = %d", result));

        //using curried function
        final var curryingResult = curryIt().apply(1)
                                            .apply(2)
                                            .apply(3);
        System.out.println(String.format("The addition result = %d", curryingResult));
    }

    static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    static Function<Integer, Function<Integer, Function <Integer, Integer>>> curryIt() {
        return a -> (b -> (c -> addNumbers(a, b, c)));
    }
}
