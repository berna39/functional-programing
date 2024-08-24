package com.terminator.concepts.monads;

import java.util.function.Function;;

public interface Monad<T> {
    <R> Monad<R> bind(Function<T, Monad<R>> mapper);
}
