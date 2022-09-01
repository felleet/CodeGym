package leetcode.problems.p217

object Solution {
  def containsDuplicate(nums: Array[Int]): Boolean = {
    val set = new collection.mutable.HashSet[Int]()
    nums.foreach(n => {
      if (set.contains(n)) {
        return true
      }
      set.add(n)
    })
    false
  }
}