package leetcode.problems.p1991

object Solution {

  def findMiddleIndex(nums: Array[Int]): Int = {
    var sumLeft = 0
    var sumRight = nums.sum
    val fount = nums.indices.find(i => {
      sumLeft = if (i==0) 0 else sumLeft + nums(i-1)
      sumRight = if (i == nums.length-1) 0 else sumRight - nums(i)
      sumLeft == sumRight
    })
    fount.getOrElse(-1)
  }
}