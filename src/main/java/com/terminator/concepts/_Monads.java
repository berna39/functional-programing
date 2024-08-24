package com.terminator.concepts;

import com.terminator.concepts.monads.Maybe;

public class _Monads {
    
    public Integer simpleWrappingExample(Integer param) {
        Maybe<Integer> maybeValue = Maybe.just(param);

        return maybeValue.getValue();
    }

    public Integer wrapAndDouble(Integer param) {
         Maybe<Integer> maybeValue = Maybe.just(param);

         return maybeValue.bind(value -> Maybe.just(value * 2))
                            .getValue();
    }

    public Integer getEmptyMaybe() {
        Maybe<Integer> emptyMaybe = Maybe.nothing();

        return emptyMaybe.getValue();
    }
}
