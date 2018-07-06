package com.alwozniak.codility.iterations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    private BinaryGap binaryGap;

    @BeforeEach
    void setUp() {
        binaryGap = new BinaryGap();
    }

    @Test
    void shouldWorkForAnExampleGivenInDescription() {
        runAndCheckSolution(1041, 5);
    }

    @Test
    void shouldReturnZeroForANumberThatHasNoZerosInBinaryRepresentation() {
        runAndCheckSolution(7, 0);
        runAndCheckSolution(31, 0);
        runAndCheckSolution(Integer.MAX_VALUE, 0);
    }

    @Test
    void shouldReturnZeroForANumberWhoseRepresentationConsistsOfLeadingOnesAndTrailingZeros() {
        runAndCheckSolution(8, 0);
        runAndCheckSolution(Integer.MAX_VALUE - 31, 0);
    }

    @Test
    void shouldWorkForSmallestPossibleInput() {
        runAndCheckSolution(1, 0);
    }

    @Test
    void shouldWorkForANumberWithMaximalBinaryGap() {
        runAndCheckSolution((int) Math.pow(2, 30) + 1, 29);
    }

    void runAndCheckSolution(int input, int expectedResult) {
        int solution = binaryGap.solution(input);
        assertEquals(expectedResult, solution);
    }
}