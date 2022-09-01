package leetcode.problems.p1903

object Solution {
  def largestOddNumber(num: String): String = {
    for (i <- num.length - 1 to 0 by -1) {
      if (num(i).toInt % 2 != 0) {
        return num.substring(0, i + 1)
      }
    }
    ""
  }
}