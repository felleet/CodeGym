package leetcode.problems.p136

object Solution {
  def singleNumber(nums: Array[Int]): Int = {
    nums.foldLeft(Map.empty[Int, Int])((dict, number) => {
      dict.updated(number, dict.getOrElse(number, 0) + 1)
    }).find(_._2 == 1).map(_._1).get
  }
}
