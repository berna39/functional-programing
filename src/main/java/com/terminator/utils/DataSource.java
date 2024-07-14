package com.terminator.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.terminator.models.Person;

public class DataSource {
    
    public static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();

        people = Stream.of(new Person("Obito", 12), 
                            new Person("Kakashi", 13), 
                            new Person("Rhin", 13))
                    .collect(Collectors.toList());

        return people;
    }
}
