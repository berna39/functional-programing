package com.terminator;

public class _SigneAbstractMethodTest {
    
    public static void main(String[] args) {
        // old boilerplate
        SingleAbstractMethodExample sam = new SingleAbstractMethodExample() {
            @Override
            public String doSomething() {
                return "Hello toby";
            }
        };
        System.out.println(sam.doSomething());

        SingleAbstractMethodExample other = () -> "Hello my people";
        System.out.println(other.doSomething());
    }
}
