package com.terminator.concepts.monads;

import java.util.function.Function;

public class Maybe<T> implements Monad<T> {

    private final T value;

    private Maybe(T val) {
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    public static <T> Maybe<T> just(T value) {
        return new Maybe<>(value);
    }

    public static <T> Maybe<T> nothing() {
        return new Maybe<>(null);
    }

    @Override
    public <R> Maybe<R> bind(Function<T, Monad<R>> mapper) {
        if(value == null) 
            return Maybe.nothing();
        else
            return (Maybe<R>) mapper.apply(value);
    }
}
