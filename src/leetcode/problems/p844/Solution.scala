package leetcode.problems.p844

object Solution {
  def backspaceCompare(s: String, t: String): Boolean = {
    val left = new collection.mutable.Stack[Char]()
    val right = new collection.mutable.Stack[Char]()

    for(letter <- s) {
      if (letter == '#') {
        if (left.nonEmpty) {
          left.pop()
        }
      } else {
        left.push(letter)
      }
    }

    for (letter <- t) {
      if (letter == '#') {
        if (right.nonEmpty) {
          right.pop()
        }
      } else {
        right.push(letter)
      }
    }

    left == right
  }
}