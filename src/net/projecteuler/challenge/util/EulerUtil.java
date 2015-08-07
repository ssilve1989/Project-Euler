package net.projecteuler.challenge.util;

/**
 * Created by steve on 8/6/15.
 */
public class EulerUtil {

    public static long getExecutionTime(long start, long end) {
        return (end - start);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static boolean isEven(int tmp) {
        return tmp % 2 == 0;
    }

    public static boolean isPrime(int n) {
        if(n <= 3) return true;
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static boolean isPalindrome(int n){
        return isPalindrome(String.valueOf(n));
    }

    public static boolean isPalindrome(String input) {
        //can handle some immediate base cases
        if(input == null) return false; //duh it was null
        if(input.length() < 2) return true; //empty or single char strings are palindromes
        String s = input.toLowerCase(); //palindromes for us are case insensitive
        boolean palindrome = true;
        for(int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(a != b){
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
