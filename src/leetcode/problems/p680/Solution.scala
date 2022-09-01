package leetcode.problems.p680

object Solution {
  def validPalindrome(s: String): Boolean = {
    var left = 0
    var right = s.length-1

    while (left < right) {
      if (s(left) != s(right)) {
        return isPalindrome(left + 1, right, s) || isPalindrome(left, right - 1, s)
      }
      left += 1
      right -= 1
    }
    true
  }

  private def isPalindrome(leftIndex: Int, rightIndex: Int, str: String): Boolean = {
    var left = leftIndex
    var right = rightIndex
    while (left < right) {
      if (str(left) != str(right)) {
        return false
      }
      left += 1
      right -= 1
    }
    true
  }
}