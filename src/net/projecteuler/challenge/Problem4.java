package net.projecteuler.challenge;

import net.projecteuler.challenge.util.EulerUtil;

/**
 * Created by steve on 8/7/15.
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public static void main(String[] args) {
        int largestPalindrome = -1;
        for(int x = 999; x > 99; x--){
            for(int y = x; y > 99; y--){
                int result = x * y;
                if(EulerUtil.isPalindrome(String.valueOf(result))){
                    if(result > largestPalindrome) largestPalindrome = result;
                }
            }
        }
        System.out.println(largestPalindrome);
    }
}
