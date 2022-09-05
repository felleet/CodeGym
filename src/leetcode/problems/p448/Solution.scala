package leetcode.problems.p448

object Solution {
  def findDisappearedNumbers(nums: Array[Int]): List[Int] = {
    //(1 to nums.length).diff(nums).toList
    val dict: Map[Int, Int] = nums.foldLeft(Map.empty[Int, Int])((m, number) =>
      m + (number -> 1)
    )

    (1 to nums.length).filter(number => {
      !dict.contains(number)
    }).toList
  }
}
