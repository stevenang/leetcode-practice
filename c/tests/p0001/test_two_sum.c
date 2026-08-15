#include "leetcode/p0001/two_sum.h"

#include <stdio.h>
#include <stdlib.h>

#define ARRAY_SIZE(array) \
    ((int)(sizeof(array) / sizeof((array)[0])))

struct test_case {
    const char *name;
    const int *nums;
    int nums_size;
    int target;
    int expected[2];
};

static int run_test(const struct test_case *test)
{
    int return_size = 0;

    int *actual = two_sum(
        test->nums,
        test->nums_size,
        test->target,
        &return_size
    );

    int passed =
        actual != NULL &&
        return_size == 2 &&
        actual[0] == test->expected[0] &&
        actual[1] == test->expected[1];

    if (passed) {
        printf(
            "PASS: %s -> [%d, %d]\n",
            test->name,
            actual[0],
            actual[1]
        );
    } else if (actual == NULL) {
        printf(
            "FAIL: %s -> expected [%d, %d], received NULL\n",
            test->name,
            test->expected[0],
            test->expected[1]
        );
    } else {
        printf(
            "FAIL: %s -> expected [%d, %d], received [%d, %d]\n",
            test->name,
            test->expected[0],
            test->expected[1],
            actual[0],
            actual[1]
        );
    }

    free(actual);

    return passed;
}

int main(void)
{
    const int standard_example[] = {2, 7, 11, 15};
    const int middle_values[] = {3, 2, 4};
    const int duplicate_values[] = {3, 3};
    const int negative_numbers[] = {-3, 4, 3, 90};
    const int negative_target[] = {-1, -2, -3, -4, -5};

    const struct test_case tests[] = {
        {
            "standard example",
            standard_example,
            ARRAY_SIZE(standard_example),
            9,
            {0, 1}
        },
        {
            "matching values in the middle",
            middle_values,
            ARRAY_SIZE(middle_values),
            6,
            {1, 2}
        },
        {
            "duplicate values",
            duplicate_values,
            ARRAY_SIZE(duplicate_values),
            6,
            {0, 1}
        },
        {
            "negative numbers",
            negative_numbers,
            ARRAY_SIZE(negative_numbers),
            0,
            {0, 2}
        },
        {
            "negative target",
            negative_target,
            ARRAY_SIZE(negative_target),
            -8,
            {2, 4}
        }
    };

    const int test_count = ARRAY_SIZE(tests);
    int passed_count = 0;

    for (int index = 0; index < test_count; index++) {
        passed_count += run_test(&tests[index]);
    }

    const int failed_count = test_count - passed_count;

    printf("\n");
    printf("========================================\n");
    printf("Total:  %d\n", test_count);
    printf("Passed: %d\n", passed_count);
    printf("Failed: %d\n", failed_count);
    printf("========================================\n");

    return failed_count == 0 ? EXIT_SUCCESS : EXIT_FAILURE;
}