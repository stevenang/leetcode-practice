class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        num_to_index = {}

        for index in range(len(nums)):
            num = nums[index]
            complement = target - num

            if complement in num_to_index:
                return [num_to_index[complement], index]

            num_to_index[num] = index
