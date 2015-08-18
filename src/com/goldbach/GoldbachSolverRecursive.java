package com.goldbach;

import java.util.ArrayList;

/**
 * Created by duber on 18/08/15.
 */
public class GoldbachSolverRecursive {

    public static ArrayList<Integer> goldbach_partition_of(int target) throws Exception {
        if (!NumberUtil.isEvenNumber(target)){
            throw new Exception("Target must be even.");
        }
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for(int i = 2 ; i < target; i++){
            if (!NumberUtil.isPrimeNumber(i)) continue;
            primeNumbers.add(i);
            for (Integer num : primeNumbers){
                if (num + i == target){
                    result.add(num);
                    result.add(i);
                    return result;
                }
            }
        }
        return result;
    }
}
