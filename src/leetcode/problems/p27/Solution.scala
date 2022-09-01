package leetcode.problems.p27

object Solution {
  def removeElement(nums: Array[Int], v: Int): Int = {
    var k = 0
    for (i <- 0 to nums.length) {
      if (nums(i) != v) {
        nums(k) = nums(i)
        k += 1
      }
    }
    k
  }
}
