package leetcode.problems.p744

object Solution {
  def nextGreatestLetter(letters: Array[Char], target: Char): Char = {
    var min = letters(0)
    for (i <- letters.indices) {
      if (letters(i) > target) {
        min = if (letters(i) < min || min <= target) letters(i) else min
      }
    }
    min
  }
}