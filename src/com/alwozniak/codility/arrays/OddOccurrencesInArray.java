package com.alwozniak.codility.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    /**
     * Simple solution with O(n^2) complexity.
     */
    public int simpleSolution(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        int i = 0;
        while (i < A.length) {
            int currentValue = A[i];
            A[i] = 0;
            int j = i;
            while (j < A.length) {
                if (A[j] == currentValue) {
                    A[j] = 0;
                    break;
                } else {
                    j++;
                }
            }
            if (j == A.length) {
                return currentValue;
            }
            i++;
        }
        return 0;
    }

    /**
     * This one should have amortised O(n) complexity -- according to JavaDoc HashSet have typical O(1) complexity for
     * lookups and addition.
     */
    public int solutionWithSets(int[] A) {
        if (A.length == 1) {
            return A[0];
        }
        Set<Integer> storage = new HashSet<Integer>();
        for (int a : A) {
            if (storage.contains(a)) {
                storage.remove(a);
            } else {
                storage.add(a);
            }
        }
        return (int) storage.toArray()[0];
    }
}
