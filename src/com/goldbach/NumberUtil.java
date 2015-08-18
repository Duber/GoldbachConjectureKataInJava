package com.goldbach;

/**
 * Created by duber on 18/08/15.
 */
public class NumberUtil {
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }


    public static boolean isPrimeNumber(int number){
        //check if number is 2, the odd even prime
        if (Math.abs(number) == 2)
            return true;
        //check if number is a multiple of 2
        if (number % 2 == 0)
            return false;

        int limit = (int) Math.sqrt(number);
        //if not, then just check the odds
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
