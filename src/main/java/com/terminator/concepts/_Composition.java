package com.terminator.concepts;

import java.util.function.Function;

public final class _Composition {

    /*
     * Use case: split complex process into small processes
     */

    public String processName(String name) {
        Function<String, String> trim = param -> param.trim();
        Function<String, String> toUpperCase = param -> param.toUpperCase();
        // the function passed in the argument executes first and then the function on which it’s invoked
        Function<String, String> trimThenUpperCase = toUpperCase.compose(trim);

        return trimThenUpperCase.apply(name);
    }

    public Double logThenSqrt(Double number) {
        Function<Double, Double> log = (value) -> Math.log(value);
        Function<Double, Double> sqrt = (value) -> Math.sqrt(value);
         // the log function will execute first
        return sqrt.compose(log).apply(number);
    }

    public Double sqrtThenLog(Double number) {
        Function<Double, Double> log = (value) -> Math.log(value);
        Function<Double, Double> sqrt = (value) -> Math.sqrt(value);
        // the sqrt function will execute first -> andThen is the opposite of compose
        return sqrt.andThen(log).apply(number);
    }
}
