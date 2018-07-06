package com.alwozniak.codility.leader;

public class Dominator {

    /**
     * Implements Golden Leader algorithm presented in the lesson reading.
     */
    public int solution(int[] A) {
        // Handle empty array case.
        if (A.length == 0) {
            return -1;
        }

        int stackSize = 0;
        int currentValue = A[0];
        for (int i = 0; i < A.length; i++) {
            if (stackSize == 0) {
                currentValue = A[i];
                stackSize++;
            } else if (A[i] == currentValue) {
                stackSize++;
            } else {
                stackSize--;
            }
        }
        if (stackSize == 0) {
            return -1;  // No leader candidate.
        }
        int leaderCandidate = currentValue;
        int count = 0;
        int lastLeaderCandidatePosition = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leaderCandidate) {
                count++;
                lastLeaderCandidatePosition = i;
            }
        }
        if (count > A.length / 2) {
            return lastLeaderCandidatePosition;
        } else {
            return -1;
        }
    }
}
