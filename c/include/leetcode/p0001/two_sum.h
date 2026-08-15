#ifndef LEETCODE_P0001_TWO_SUM_H
#define LEETCODE_P0001_TWO_SUM_H
/**
 * Finds the indices of two numbers whose values add up to the target.
 *
 * Exactly one valid solution is expected, and an array element cannot
 * be used more than once.
 *
 * @param nums
 *     Input array of integers. This function does not modify the array.
 *     Must not be NULL when nums_size is greater than zero.
 *
 * @param nums_size
 *     Number of elements in the nums array.
 *
 * @param target
 *     The target sum.
 *
 * @param return_size
 *     Output parameter. Set to 2 when a solution is found and 0 when
 *     no solution is found. Must not be NULL.
 *
 * @return
 *     A dynamically allocated array containing the two matching indices.
 *     The caller owns this array and must release it with free().
 *
 *     Returns NULL when no solution is found or the input is invalid.
 */
int *two_sum(
    const int *nums,
    int nums_size,
    int target,
    int *return_size
);
#endif