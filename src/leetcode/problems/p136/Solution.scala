package leetcode.problems.p136

object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    nums.foldLeft(0)(_ ^ _)
  }
}
