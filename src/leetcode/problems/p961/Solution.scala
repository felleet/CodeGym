package leetcode.problems.p961

object Solution {
  def repeatedNTimes(nums: Array[Int]): Int = {
    val map = new collection.mutable.HashMap[Int, Int]
    for(n <- nums) {
      val x = map.getOrElse(n, 0) + 1
      if (x > 1) {
        return n
      }
      map.put(n,  x)
    }
    nums(0)
  }
}