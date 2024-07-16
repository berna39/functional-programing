package com.terminator.scenarios;

public class _Recusion {
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(5, 1));
    }

    /*
     * we’re making the recursive call before calculating the result at each step or in words
     * at the head of the calculation. This style of recursion is also known as head recursion.
     */
    static Integer factorial(Integer number) {
        return (number == 1) ? 1 : number * factorial(number - 1);
    }

    /*
     * tail recursion technique -> more efficient
     */
    static Integer factorial(Integer number, Integer result) {
        return (number == 1) ? result : factorial(number - 1, result * number);
    }
}
