package com.terminator;

import java.util.List;
import java.util.function.Predicate;

public class _Predicate {
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
    

        // ----- and ------ //
        // and(Predicate other) : Returns a composed predicate that represents a short-circuiting 
        // logical AND of this predicate and another.
        Predicate<Integer> greaterThanTen = (number) -> number > 10;
        Predicate<Integer> lessThanTwenty = (number) -> number < 20;
        System.out.println(greaterThanTen.and(lessThanTwenty).test(13)); // chaining predicates

        // ----- Predicate or ------ //
        // or(Predicate other) : Returns a composed predicate that represents a short-circuiting logical OR 
        // of this predicate and another.
        Predicate<String> containsLetterP = (password) -> password.contains("P");
        Predicate<String> hasLengthOf12 = (password) -> password.length() == 12;
        System.out.println(containsLetterP.or(hasLengthOf12).test("Ping")); // true :)
        System.out.println(containsLetterP.or(hasLengthOf12).test("Ong")); // false :(
    }
}
