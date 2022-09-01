package leetcode.problems.p268

object Solution {
  def missingNumber(nums: Array[Int]): Int = {
    var r = nums.length
    for(i <- 0 until nums.length) {
      r ^= i ^ nums(i)
    }
    r
  }
}