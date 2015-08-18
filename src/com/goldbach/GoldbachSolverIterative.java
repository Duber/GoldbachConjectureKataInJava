package com.goldbach;

import java.util.ArrayList;

/**
 * Created by duber on 18/08/15.
 */
public class GoldbachSolverIterative {

    public static ArrayList<Integer> goldbach_partition_of(int target) throws Exception {
        if (!NumberUtil.isEvenNumber(target)){
            throw new Exception("Target must be even.");
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for(int i = 2 ; i < target; i++){
            if (!NumberUtil.isPrimeNumber(i)) continue;
            primeNumbers.add(i);
            int limit = primeNumbers.size();
            for(int j = 0; j < limit; j++){
                if ( i + primeNumbers.get(j) == target){
                    result.add(primeNumbers.get(j));
                    result.add(i);
                    return result;
                }
            }
        }
        return result;
    }
}
