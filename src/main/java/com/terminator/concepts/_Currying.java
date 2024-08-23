package com.terminator.concepts;

import java.util.function.Function;

public class _Currying {
    
    /*
    *  technique of converting a function that takes multiple arguments
    *  into a sequence of functions that take a single argument.
    * 
    *  Moreover, a curried function does not realize its effect until it 
    *  receives all the arguments.
    * 
    *  I can call it also chaining functions
    */
    public Double firstExample(Double width, Double height) {
        Function<Double, Function<Double, Double>> rectangleArea = h -> w -> h * w;
        Function<Double, Double> setHeightAndWaitForWidth = rectangleArea.apply(height);

        return setHeightAndWaitForWidth.apply(width);
    }

    public Double secondExample(Double width, Double height) {
        Function<Double, Function<Double, Double>> rectangleArea = h -> w -> h * w;

        return rectangleArea.apply(width).apply(height);
    }

    public int thridExample(int a, int b, int c) {
        return curryIt().apply(a)
                        .apply(b)
                        .apply(c);
    }

    private Function<Integer, Function<Integer, Function <Integer, Integer>>> curryIt() {
        return a -> (b -> (c -> addNumbers(a, b, c)));
    }

    private static int addNumbers(int x, int y, int z) {
        return x + y + z;
    }
}
