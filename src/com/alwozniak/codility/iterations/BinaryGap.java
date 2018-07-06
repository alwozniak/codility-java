package com.alwozniak.codility.iterations;

import java.util.ArrayList;

public class BinaryGap {
    public int solution(int N) {
        ArrayList<Integer> binaryRepresentation = new ArrayList<Integer>(32);
        int aux = N;
        while (aux > 0) {
            binaryRepresentation.add(aux % 2);
            aux = aux / 2;
        }
        int maxLength = 0;
        int tempLength;
        int index = 0;
        int maxIndex = binaryRepresentation.size();
        while (binaryRepresentation.get(index) == 0 && index < 32) {
            index++;
        }
        while (index < maxIndex) {
            tempLength = 0;
            while (index < maxIndex && binaryRepresentation.get(index) == 1) {
                index++;
            }
            while (index < maxIndex && binaryRepresentation.get(index) == 0) {
                tempLength++;
                index++;
            }
            if (tempLength > maxLength) {
                maxLength = tempLength;
            }
        }
        return maxLength;
    }
}
