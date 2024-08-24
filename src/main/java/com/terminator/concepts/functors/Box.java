package com.terminator.concepts.functors;

import java.util.function.Function;

public class Box<T> implements Functor<T> {

    private T value;

    public Box(T val) {
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    @Override
    public <R> Functor<R> map(Function<T, R> function) {
        R result = function.apply(value);

        return new Box<>(result); 
    }
}
