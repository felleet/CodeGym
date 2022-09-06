package leetcode.problems.p338

object Solution {
  def countBits(n: Int): Array[Int] = {
    (0 to n).map(count).toArray
  }

  def count(n: Int): Int = {
    if (n == 0) return 0
    if (n == 1) return 1
    if (n % 2== 0) count(n /2) else 1 + count(n/2)
  }
}