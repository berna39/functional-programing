package com.terminator;

import java.util.function.Consumer;

public class _Consumer {
    // a consumer accepts a single input and retuens not result
    public static void main(String[] args) {
        display.accept("AKATSUKI");
    }

    static Consumer<String> display = (value) -> 
                    System.out.println(String.format("The value is : %s", value));
                    
    // Signature Consumer<T>
}
