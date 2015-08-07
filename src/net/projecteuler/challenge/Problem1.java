package net.projecteuler.challenge;

/**
 * Created by steve on 8/6/15.
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Verified Correct
 */
public class Problem1 {

    public static void main(String[] args) {
        Long start = System.currentTimeMillis();

        int sum = 0;
        //runtime is O(n)...can we do better?
        for(int i = 0; i < 1000; i++){
            if( i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        //end time
        System.out.println(System.currentTimeMillis() - start);
    }
}
