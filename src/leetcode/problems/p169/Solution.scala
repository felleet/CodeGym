package leetcode.problems.p169

object Solution {
  def majorityElement(nums: Array[Int]): Int = {
    val map = new collection.mutable.HashMap[Int, Int]
    val majority = Math.round(nums.length.toDouble / 2d)
    for(x <- nums) {
      map.put(x, map.getOrElse(x, 0) + 1)
    }
    map.find(_._2 >= majority).map(_._1).getOrElse(-1)
  }
}