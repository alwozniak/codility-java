package com.alwozniak.codility.arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int size = A.length;
        // Handle empty array case.
        if (size == 0) {
            return A;
        }

        // If number of rotations is a multiplication of array size, nothing will change.
        int kLimited = K % size;
        if (kLimited == 0) {
            return A;
        }

        int[] result = new int[size];
        // Write rotated elements to the beginning of the array.
        for (int i = 0; i < kLimited; i++) {
            result[i] = A[size - kLimited + i];
        }
        // Write other elements.
        for (int i = kLimited; i < size; i++) {
            result[i] = A[i - kLimited];
        }
        return result;
    }
}
