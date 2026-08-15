package leetcode.p0001;
import java.util.HashMap;

public class TwoSum {
    public int[] solution(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), index };
            } else {
                map.put(nums[index], index);
            }
        }

        return new int[] {};
    }
}
