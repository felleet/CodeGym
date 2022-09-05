package leetcode.problems.p70

object Solution {
  def climbStairs(n: Int): Int = {
    if (n == 1) return 1
    var n1 = 1
    var n2 = 2
    (3 until n + 1).foreach(x => {
      val tmp = n1 + n2
      n1 = n2
      n2 = tmp
    })
    n2
  }
}
