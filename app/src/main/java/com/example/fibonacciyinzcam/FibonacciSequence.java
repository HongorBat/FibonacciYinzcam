package com.example.fibonacciyinzcam;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
    Fibonacci Sequence Generator class

    @author Khongor Battogotkh
 */
class FibonacciSequence {
    //ArrayList for memoization
    //Use BigInteger in order to store large numbers
    private List<BigInteger> fibNum;

    //Fibonacci number limit as per requirement is 1000
    private int MAX_SIZE = 1000;

    //Constructor
    public FibonacciSequence(){
        //
        fibNum = new ArrayList<>(MAX_SIZE);

        //0-th and 1st number of the series;
        fibNum.add(BigInteger.ZERO);
        fibNum.add(BigInteger.ONE);

        //Function that generates fibonacci sequence 0 < n <= 1000
        generateFibNum();
    }

    private void generateFibNum(){
        for(int i = 2; i <= MAX_SIZE; i++){
            fibNum.add(fibNum.get(i-1).add(fibNum.get(i-2)));
        }
    }

    /**
     * Returns list of Fibonacci Numbers
     * @return fibNum
     */
    public List<BigInteger> getFibNum(){ return fibNum; }
}
