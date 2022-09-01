package leetcode.problems.p1752

object Solution {
  def check(nums: Array[Int]): Boolean = {
    for (x <- nums.length - 1 to 0 by -1) {
      val sortedAndRotated = check(nums, x)
      if (sortedAndRotated) {
        return true
      }
    }
    false
  }

  def check(nums: Array[Int], x: Int): Boolean = {
    //A[i] == B[(i+x) % A.length]
    for(i <- nums.indices) {
      if (nums(i) != nums((i + x) % nums.length)) {
        return false
      }
    }
    true
  }
}