package com.terminator.citizens;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    
    public static void main(String[] args) {
        // A Supplier represents a function which does not take in any argument but produces a value of type T.
        Supplier<Double> giveMeARandomNumber = () -> Math.random();
        Supplier<List<String>> getDatabaseUrls = () -> List.of(
            "jdbc://localhost:5432", "jdbc://localhost:3306");

        System.out.println(giveMeARandomNumber.get());
        System.out.println(getDatabaseUrls.get().get(0));
        System.out.println(getDatabaseUrls.get().get(1));
    }
}
