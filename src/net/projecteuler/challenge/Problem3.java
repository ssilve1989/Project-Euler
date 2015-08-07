package net.projecteuler.challenge;

import net.projecteuler.challenge.util.EulerUtil;

import java.math.BigInteger;

/**
 *  Created by steve on 8/6/15.
 *  The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {

    private static long largestPrime(long n){
        long div = n;
        int p = 3;
        long largestPrime = Long.BYTES;

        //remove even
        while(div % 2 == 0){
            largestPrime = 2;
            div = div / 2;
        }

        //check odd factors
        while(div != 1){
            while( div % p == 0){
                largestPrime = p;
                div = div / p;
            }
            p = p + 2;
        }
        return largestPrime;
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long n = 600851475143L;
        System.out.println(largestPrime(n));
        System.out.println(EulerUtil.getExecutionTime(start, System.currentTimeMillis()));
    }
}
