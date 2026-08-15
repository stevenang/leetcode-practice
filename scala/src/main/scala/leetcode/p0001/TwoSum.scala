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
    var index = 0

    while index < nums.length do
        val currentValue = nums(index)
        val complementValue = target - currentValue

        complementIndexMap.get(complementValue) match
            case Some(complementIndex) =>
                return Array(complementIndex, index)
            case None =>
                complementIndexMap(currentValue) = index

        index += 1

    return Array.empty[Int]