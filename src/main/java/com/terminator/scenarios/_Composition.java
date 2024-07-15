package com.terminator.scenarios;

import java.util.function.Function;

public class _Composition {
    
    public static void main(String[] args) {
        Function<String, String> trim = s -> s.trim();
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        // the function passed in the argument executes first and then the function on which it’s invoked
        Function<String, String> trimThenUpperCase = toUpperCase.compose(trim);
        System.out.println(trimThenUpperCase.apply("      jude bellingham"));
    }
}
