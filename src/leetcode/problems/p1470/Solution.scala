package leetcode.problems.p1470

object Solution {
  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val arr = new Array[Int](nums.length)
    for(i <- 0 until n) {
      arr(i * 2) = nums(i)
      arr(i * 2 + 1) = nums(n + i)
    }
    arr
  }
}