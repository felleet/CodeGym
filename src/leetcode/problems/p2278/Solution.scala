package leetcode.problems.p2278

object Solution {
  def percentageLetter(s: String, letter: Char): Int = {
    s.count(_ == letter) * 100 / s.length
  }
}