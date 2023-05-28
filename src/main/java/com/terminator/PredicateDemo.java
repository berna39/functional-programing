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
    }
}
