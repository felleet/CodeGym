package leetcode.problems.p303

class NumArray(_nums: Array[Int]) {

  val preSum = _nums.scanLeft(0)(_ + _)

  def sumRange(left: Int, right: Int): Int = {
    preSum(right + 1) - preSum(left)
  }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */