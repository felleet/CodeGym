package leetcode.problems.p744

object Solution {
  def nextGreatestLetter(letters: Array[Char], target: Char): Char = {
    var left = 0
    var right = letters.length-1
    while (left <= right) {
      val mid = left + (right - left) / 2
      if (letters(mid) > target) {
        right = mid - 1
      } else {
        left = mid + 1
      }
    }
    letters(left % letters.length)
  }
}