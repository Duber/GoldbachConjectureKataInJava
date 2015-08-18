package com.goldbach;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by duber on 18/08/15.
 */
public class GoldbachSolverRecursive {

    private ArrayList<Integer> primeNumbers = new ArrayList<>();
    private int primeCandidate = 2;

    public ArrayList<Integer> goldbach_partition_of(int target) throws Exception {
        if (!NumberUtil.isEvenNumber(target)){
            throw new Exception("Target must be even.");
        }
        if (primeCandidate >= target) return new ArrayList<>();

        if (!NumberUtil.isPrimeNumber(primeCandidate)) {
            primeCandidate++;
            return goldbach_partition_of(target);
        }

        primeNumbers.add(primeCandidate);

        for (int i = 0; i < primeNumbers.size(); i++){
            int num = primeNumbers.get(i);
            if (num + primeCandidate == target){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(num);
                result.add(primeCandidate);
                return result;
            }
        }

        primeCandidate++;
        return goldbach_partition_of(target);

    }

}
