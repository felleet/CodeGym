package leetcode.problems.p2367

object Solution {
  def arithmeticTriplets(nums: Array[Int], diff: Int): Int = {
    var count = 0
    val set = collection.mutable.Set[Int]()
    for (n <- nums) {
      if (set.contains(n - diff) && set.contains(n - diff * 2)) {
        count += 1
      }
      set.add(n)
    }
    count
  }
}