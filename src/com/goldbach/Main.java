package com.goldbach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        /*for (int i = 0; i < 100000; i++){
            if (isEvenNumber(i)){
                System.out.println(goldbach_partition_of(i));
            }
        }*/

        System.out.println(GoldbachSolverIterative.goldbach_partition_of(10000000));

    }



}
