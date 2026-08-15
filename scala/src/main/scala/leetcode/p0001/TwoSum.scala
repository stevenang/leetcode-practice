package leetcode.p0001

import scala.collection.mutable

object TwoSum:
  /**
   * Returns the indices of two numbers whose sum equals the target.
   *
   * @param nums   input numbers
   * @param target required sum
   * @return the two matching indices
   */
  def solution(nums: Array[Int], target: Int): Array[Int] =
    val complementIndexMap = mutable.Map.empty[Int, Int]
    for ((value, index) <- nums.zipWithIndex) {
        val complementValue = target - value
        if (complementIndexMap.contains(complementValue)) {
            return Array(complementIndexMap(complementValue), index)
        } else {
            complementIndexMap(value) = index
        }
    }

    return Array.empty[Int]