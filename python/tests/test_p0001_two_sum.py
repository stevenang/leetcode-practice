import pytest

from solutions.p0001_two_sum import Solution

@pytest.mark.parametrize(
    ("nums", "target", "expected"),
    [
        ([2, 7, 11, 15], 9, [0, 1]),
        ([3, 2, 4], 6, [1, 2]),
        ([3, 3], 6, [0, 1]),
        ([-3, 4, 3, 90], 0, [0, 2]),
        ([-1, -2, -3, -4, -5], -8, [2, 4]),
    ],
)
def test_two_sum(
    nums: list[int], 
    target: int, 
    expected: list[int]
) -> None:
    solution = Solution()
    result = solution.twoSum(nums, target)
    for item in result:
        assert item in expected