package leetcode.problems.p9

object Solution {

  def isPalindrome(x: Int): Boolean = {
    if (x < 0 || (x != 0 && (x % 10 ==0))){
      return false
    }
    val array = x.toString.toCharArray
    val middle = array.length / 2
    var right = array.length - 1
    for (left <- 0 to middle) {
      if (array(left) != array(right)){
        return false
      }
      right -= 1
    }
    true
  }
}
