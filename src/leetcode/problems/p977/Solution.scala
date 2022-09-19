package leetcode.problems.p977

object Solution {
  def sortedSquares(nums: Array[Int]): Array[Int] = {
    val arr: Array[Int] = new Array(nums.length)

    var leftIndex = 0
    var rightIndex = nums.length-1

    (nums.length - 1 to 0 by -1).foreach { i =>
      if (Math.abs(nums(leftIndex)) > Math.abs(nums(rightIndex))) {
        arr(i) = nums(leftIndex) * nums(leftIndex)
        leftIndex += 1
      } else {
        arr(i) = nums(rightIndex) * nums(rightIndex)
        rightIndex -= 1
      }
    }
    arr
  }
}