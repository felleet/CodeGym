package leetcode.problems.p26

object Solution {
  def removeDuplicates(nums: Array[Int]): Int = {
    var prev = nums(0)
    var k = 1
    for (i <- 1 until nums.length) {
      if (nums(i) == prev) {
        //do nothing
      } else {
        nums(k) = nums(i)
        prev = nums(i)
        k += 1
      }
    }
    k
  }
}