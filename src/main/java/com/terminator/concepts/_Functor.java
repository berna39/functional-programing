package com.terminator.concepts;

import com.terminator.concepts.functors.Box;

public class _Functor {

    public Box<Integer> tripleFunctor(Integer a) {
        Box<Integer> initialValue = new Box<>(a);

        return (Box<Integer>) initialValue.map(v -> v * 3);
    }

    public Box<String> toUpperCaseFunctor(String word) {
        Box<String> wrappedValue = new Box<>(word);

        return (Box<String>) wrappedValue.map(v -> v.toUpperCase());
    }
}
