#include "leetcode/p0001/two_sum.h"

#include <stddef.h>
#include <stdlib.h>

int *two_sum(
    const int *nums,
    int nums_size,
    int target,
    int *return_size
)
{
    if (return_size == NULL) {
        return NULL;
    }

    *return_size = 0;

    if (nums == NULL || nums_size < 2) {
        return NULL;
    }

    for (int first_index = 0; first_index < nums_size - 1; first_index++) {
        for (
            int second_index = first_index + 1;
            second_index < nums_size;
            second_index++
        ) {
            long long sum =
                (long long)nums[first_index] + nums[second_index];

            if (sum == target) {
                int *result = malloc(2 * sizeof(*result));

                if (result == NULL) {
                    return NULL;
                }

                result[0] = first_index;
                result[1] = second_index;

                *return_size = 2;
                return result;
            }
        }
    }

    return NULL;
}