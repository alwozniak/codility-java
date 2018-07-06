package com.alwozniak.codility.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @BeforeEach
    void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    void shouldReturnEmptyArrayIfEmptyArrayGiven() {
        int[] A = new int[]{};
        int[] solution = cyclicRotation.solution(A, 0);
        assertEquals(0, solution.length);
    }

    @Test
    void shouldReturnTheSameArrayIfNoRotationRequired() {
        int[] A = new int[] {1, 2, 3, 4};
        int[] solution = cyclicRotation.solution(A, 0);
        assertArrayEquals(A, solution);
    }

    @Test
    void shouldReturnRotatedArrayIfKIsSmallerThanArraySize() {
        int[] A = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] solution = cyclicRotation.solution(A, 3);
        assertArrayEquals(new int[] {6, 7, 8, 1, 2, 3, 4, 5}, solution);
    }

    @Test
    void shouldReturnUnmodifiedArrayIfKIsAMultipleOfArraySize() {
        int[] A = new int[] {1, 2, 3, 4};
        int[] solution = cyclicRotation.solution(A, 12);
        assertArrayEquals(A, solution);
    }
}