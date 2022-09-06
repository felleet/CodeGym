package leetcode.problems.p303

class NumArray(_nums: Array[Int]) {

  def sumRange(left: Int, right: Int): Int = {
    (left to right).map(_nums(_)).sum
  }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */