package net.projecteuler.challenge.test;

import net.projecteuler.challenge.util.EulerUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by steve on 8/6/15.
 */
public class Tester {

    @Test
    public void Problem2Test(){
        //verify euler worked correctly
        int result = 0;
        for(int i = 10; i != 0; i--){
            result += EulerUtil.fibonacci(i);
        }
        assertEquals(231, result);
    }

    @Test
    public void primeTester(){
        assertTrue(EulerUtil.isPrime(2));
        assertTrue(EulerUtil.isPrime(3));
        assertFalse(EulerUtil.isPrime(4));
        assertTrue(EulerUtil.isPrime(5));
        assertTrue(EulerUtil.isPrime(7));
        assertFalse(EulerUtil.isPrime(9));
    }

    @Test
    public void palindromeTester(){
        String[] palindromes = {"poop", "", " ", "a", "rAcECaR", "racecar"};
        String[] notPalindromes = {"nope", "not", "even", "close"};
        for(String p : palindromes){
            assertTrue(EulerUtil.isPalindrome(p));
        }
        for(String np : notPalindromes){
            assertFalse(EulerUtil.isPalindrome(np));
        }
    }
}
