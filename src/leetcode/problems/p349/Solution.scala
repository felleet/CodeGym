package leetcode.problems.p349

object Solution {
  import scala.collection.mutable
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val n1set = nums1.toSet
    val result = mutable.HashSet.empty[Int]
    nums2.foreach(x => {
      if (n1set.contains(x)) {
        result += x
      }
    })
    result.toArray
  }
}
