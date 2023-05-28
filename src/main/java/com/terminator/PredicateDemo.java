package com.terminator;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Person> people = DataSource.getPeople();

        // A pridicate is a boolean-valued function of one argument.
        Predicate<Person> predicate = (person) -> person.getAge() > 12;

        people.stream().filter(predicate).forEach(p -> {
            System.out.println(p);
        });

        // ------------- Predicate methods ------------- //

        // test(T t) : Evaluates this predicate on the given argument.boolean test(T t)
        Predicate<Integer> lesserthan = i -> (i < 18); 
        System.out.println(lesserthan.test(13));
        System.out.println(lesserthan.test(32));
        
        // ----- Predicate negate ------ //

        // ----- and ------ //
        // and(Predicate other) : Returns a composed predicate that represents a short-circuiting 
        // logical AND of this predicate and another.
        Predicate<Integer> greaterThanTen = (number) -> number > 10;
        Predicate<Integer> lessThanTwenty = (number) -> number < 20;
        System.out.println(greaterThanTen.and(lessThanTwenty).test(13)); // chaining predicates

        // ----- Predicate or ------ //

        // ----- Predicate equals ------ //
    }
}
