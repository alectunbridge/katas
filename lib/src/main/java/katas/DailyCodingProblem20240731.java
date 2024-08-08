package katas;

import java.util.List;

public class DailyCodingProblem20240731 {

    public List<Integer> solve(List<Integer> numbers) {
        Integer product = numbers.stream().reduce((a, b) -> a * b).orElse(0);
        return numbers.stream().map(n -> product / n).toList();
    }

}