package leetcode.problems.p169

object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    val sortedArray = nums.sorted
    sortedArray(nums.length / 2)
  }
}