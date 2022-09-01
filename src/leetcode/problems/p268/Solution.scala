package leetcode.problems.p268

object Solution {
  def missingNumber(nums: Array[Int]): Int = {
    val n = nums.length
    val sorted = nums.sorted
    for(i <- 0 until n) {
      if (i != sorted(i)) {
        return i
      }
    }
    n
  }
}