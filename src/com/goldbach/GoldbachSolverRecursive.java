package com.goldbach;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by duber on 18/08/15.
 */
public class GoldbachSolverRecursive {

    public static ArrayList<Integer> goldbach_partition_of(int target) throws Exception {
        if (!NumberUtil.isEvenNumber(target)){
            throw new Exception("Target must be even.");
        }
        AtomicReference ref = new AtomicReference();
        ref.set(new ArrayList<Integer>());

        return goldbach_solver(target, 2, ref);
    }

    private static ArrayList<Integer> goldbach_solver(int target, int primeCandidate, AtomicReference<ArrayList<Integer>> primeNumbersRef){
        if (!NumberUtil.isPrimeNumber(primeCandidate)) return goldbach_solver(target, primeCandidate+1, primeNumbersRef);
        if (primeCandidate >= target) return new ArrayList<>();

        ArrayList<Integer> primeNumbers = primeNumbersRef.get();
        primeNumbers.add(primeCandidate);
        primeNumbersRef.set(primeNumbers);

        for (int i = 0; i < primeNumbers.size(); i++){
            int num = primeNumbers.get(i);
            if (num + primeCandidate == target){
                ArrayList<Integer> result = new ArrayList<>();
                result.add(num);
                result.add(primeCandidate);
                return result;
            }
        }
        return goldbach_solver(target, primeCandidate+1, primeNumbersRef);
    }
}
