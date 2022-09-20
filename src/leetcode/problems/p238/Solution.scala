package leetcode.problems.p238

object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val arr = new Array[Int](nums.length)
    for(i <- nums.indices) {
      var x = 1
      for(j <- nums.indices) {
        if (j != i) {
          x = nums(j) * x
        }
      }
      arr(i) = x
    }
    arr
  }
}