package leetcode.p0001

class TwoSum {
    int [] solution(int[] nums, int target) {
        def complementIndexMap = [:]
        for (int index = 0; index < nums.length; index++) {
            def complement = target - nums[index]
            if (complementIndexMap.containsKey(complement)) {
                print([complementIndexMap[complement], index])
                return [complementIndexMap[complement], index]
            } else {
                complementIndexMap[nums[index]] = index
            }
        }
        return []
    }
}