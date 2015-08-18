package com.goldbach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    System.out.println(goldbach_partition_of(8));
    }

    public static ArrayList<Integer> goldbach_partition_of(int target) throws Exception {
        if (!isEvenNumber(target)){
            throw new Exception("Target must be even.");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for(int i = 2 ; i < target; i++){
            if (!isPrimeNumber(i)) continue;
            primeNumbers.add(i);
            for(int j = 0; j < primeNumbers.size(); j++){
                if ( i + primeNumbers.get(j) == target){
                    result.add(primeNumbers.get(j));
                    result.add(i);
                    return result;
                }
            }
        }
        return result;
    }

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
