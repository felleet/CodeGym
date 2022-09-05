package leetcode.problems.p448

object Solution {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    (1 to nums.length).diff(nums).toList
  }
}
