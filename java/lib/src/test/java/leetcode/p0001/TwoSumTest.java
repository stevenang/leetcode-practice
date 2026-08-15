package leetcode.p0001;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest(name = "{0}")
    @MethodSource("testCases")
    void returnsExpectedIndices(
            String testName,
            int[] nums,
            int target,
            int[] expected) {

        int[] actual = twoSum.solution(nums, target);

        assertArrayEquals(expected, actual);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        "standard example",
                        new int[]{2, 7, 11, 15},
                        9,
                        new int[]{0, 1}),

                Arguments.of(
                        "matching values in the middle",
                        new int[]{3, 2, 4},
                        6,
                        new int[]{1, 2}),

                Arguments.of(
                        "duplicate values",
                        new int[]{3, 3},
                        6,
                        new int[]{0, 1}),

                Arguments.of(
                        "negative numbers",
                        new int[]{-3, 4, 3, 90},
                        0,
                        new int[]{0, 2}),

                Arguments.of(
                        "negative target",
                        new int[]{-1, -2, -3, -4, -5},
                        -8,
                        new int[]{2, 4}));
    }
}