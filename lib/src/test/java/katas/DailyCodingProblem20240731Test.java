package katas;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class DailyCodingProblem20240731Test {

    @Test
    void testExample() {
        DailyCodingProblem20240731 solver = new DailyCodingProblem20240731();

        int[] input = {1, 2, 3, 4, 5};
        int[] expectedOutput = {120, 60, 40, 30, 24};
        assertThat(solver.solve(Arrays.stream(input).boxed().toList()))
                .isEqualTo(Arrays.stream(expectedOutput).boxed().toList());
    }

}