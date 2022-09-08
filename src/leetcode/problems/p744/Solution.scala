package leetcode.problems.p744

object Solution {
  def nextGreatestLetter(letters: Array[Char], target: Char): Char = {
    letters.find(_ > target).getOrElse(letters(0))
  }
}