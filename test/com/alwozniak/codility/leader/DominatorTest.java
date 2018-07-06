package com.alwozniak.codility.leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {

    private Dominator dominator;

    @BeforeEach
    void setUp() {
        dominator = new Dominator();
    }

    @Test
    void emptyArrayHasNoDominator() {
        assertEquals(-1, dominator.solution(new int[] {}));
    }

    @Test
    void correctlyRecognizesArrayWithoutDominator() {
        assertEquals(-1, dominator.solution(new int[] {1, 2, 3, 4, 5}));
        assertEquals(-1, dominator.solution(new int[] {1, 2, 1, 2, 5}));
    }

    @Test
    void worksForExampleGivenInTaskDescription() {
        int result = dominator.solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3});
        Set<Integer> possibleSolutions = new HashSet<>(Arrays.asList(0, 2, 4, 6, 7));
        assertTrue(possibleSolutions.contains(result));
    }

    @Test
    void worksForArrayWithoutDominatorForWhichStackIsNotEmptyAtTheEnd() {
        assertEquals(-1, dominator.solution(new int[] {4, 4, 4, 1, 2, 3, 1}));
    }
}