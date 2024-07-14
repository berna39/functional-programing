package com.terminator;

import java.util.List;
import java.util.function.Function;

import com.terminator.models.Person;
import com.terminator.utils.DataSource;

public class App {
    public static void main( String[] args ) {
        List<Person> students = DataSource.getPeople();

        // Imperative programming
        // Displaying
        for(Person p : students) {
            System.out.println(p);
        }

        // Functional programing
        // Displaying
        students.forEach(System.out::println);

        Function<Integer, Integer> increment = i -> ++i;

        int a = increment.apply(5);
        System.out.println(a);
    }
}
