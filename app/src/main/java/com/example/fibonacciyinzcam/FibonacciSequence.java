package com.example.fibonacciyinzcam;

import java.math.BigInteger;

/**
    Fibonacci Sequence Generator class
    @author Khongor Battogotkh
 */
class FibonacciSequence {
    //Array for memoization
    //Use BigInteger in order to store large numbers
    private BigInteger[] cache;

    //Fibonacci number limit as per requirement is 1000
    private int MAX_SIZE = 1000;

    //Constructor
    public FibonacciSequence(){
        cache = new BigInteger[MAX_SIZE + 1];

        // 0-th and 1st fibonacci number
        cache[0] = BigInteger.ZERO;
        cache[1] = BigInteger.ONE;
    }

    /**
     *
     * @param pos - position of the fibonacci number
     * @return fibonacci number
     */
    public BigInteger getFib(int pos){
        //To avoid ArrayOutOfBoundsException
        if (pos > MAX_SIZE) return null;

        //Check if the number already exists in the cache
        if(cache[pos] != null){
            return cache[pos];
        } else {
            cache[pos] = getFib(pos-1).add(getFib(pos-2));
        }

        return cache[pos];
    }

    /**
     * @return total number of fibonacci numbers generated
     */
    public int getCount(){
        return cache.length;
    }

}
