package com.terminator.citizens;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    // A Consumer accepts a single input and returns not result
    public static void main(String[] args) {
        display.accept("AKATSUKI");
        displayNames.accept("Obito", "Uchiwa");
    }

    static Consumer<String> display = (value) -> 
                    System.out.println(String.format("The value is : %s", value));
    // Signature Consumer<T>

    // A BiConsumer accepts two input values and returns not result
    static BiConsumer<String, String> displayNames = (name,  lastName) ->
                    System.out.println(String.format("The name is : %s - %s", name, lastName));
}
