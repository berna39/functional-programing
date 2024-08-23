package com.terminator.concepts;

public class _Recusion {

    /*
     *  Best use cases: when I have a tree data structure and I need BACKTRACKING capabilities
     *  Note: anything I can do with a recursion, I can do it with a loop and a Stack
     */


    /*
     * we’re making the recursive call before calculating the result at each step. 
     * This style of recursion is also known as head recursion.
     */
    public int factorial(int number) {
        //      base case               recusive case
        return (number == 1) ? 1 : number * factorial(number - 1);
    }

    /*
     * tail recursion technique -> more efficient because we hold the n-1 execution result
     *  so that we may not hold all the previous execution results
     */
    public int factorial(int number, int result) {
        //      base case               recusive case
        return (number == 1) ? result : factorial(number - 1, result * number);
    }

    public int sum(int number) {
        // base case
        if(number >= 1) {
            //              recurvice case
            return number + sum(number - 1);
        }

        return number;
    }

    public int sum(int param, int accumulator) {
        if(param >= 1) {
            return accumulator + param;
        }

        return sum(param - 1, accumulator + param);
    }
}
