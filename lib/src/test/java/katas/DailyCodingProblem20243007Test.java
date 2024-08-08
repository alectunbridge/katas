package katas;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class DailyCodingProblem20243007Test {

    @Test
    void testExample() {
//        For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

        DailyCodingProblem20240730 solver = new DailyCodingProblem20240730();
        assertThat(solver.areRequiredNumbersInList(new int[]{10, 15, 3, 7}, 17)).isTrue();
    }
}