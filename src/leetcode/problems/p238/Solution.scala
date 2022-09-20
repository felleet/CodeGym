package leetcode.problems.p238

object Solution {
  def productExceptSelf(nums: Array[Int]): Array[Int] = {
    val arr = new Array[Int](nums.length)
    /*
    * idea is to calculate product as left * right, where left is product of nums to the left from i,
    * and right is product of nums from the right side from i
    * */
    arr(0) = 1
    //calculate lefts
    for(i <- 1 until nums.length) {
      arr(i) = arr(i-1) * nums(i-1)
    }
    var right = 1
    for (i <- nums.length - 1 to 0 by -1) {
      arr(i) *= right
      right *= nums(i)
    }
    arr
  }
  /*
  *
  * We can get lefts and rights:
  Numbers:     2    3    4     5
  Lefts:            2  2*3 2*3*4
  Rights:  3*4*5  4*5    5
  Let’s fill the empty with 1:

  Numbers:     2    3    4     5
  Lefts:       1    2  2*3 2*3*4
  Rights:  3*4*5  4*5    5     1
  * */
}