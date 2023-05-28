package com.terminator;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        List<Person> students = DataSource.getPeople();

        // Imperative programming
        for(Person p : students){
            System.out.println(p);
        }

        // Functional programing
        // Displaying
        students.forEach(System.out::println);
    }
}
