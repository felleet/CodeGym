package leetcode.problems.p1544

object Solution {
  def makeGood(s: String): String = {
    if (s.length < 2) {
      return s
    }
    val stack = new collection.mutable.Stack[Char]()
    stack.push(s(0))
    for (i <- 1 until s.length) {
      val ch = s(i)
      val inverted = if (ch.isUpper) ch.toLower else ch.toUpper
      if (stack.nonEmpty && stack.top == inverted){
        stack.pop()
      } else {
        stack.push(ch)
      }
    }
    stack.foldLeft("")((a, b) => b + a)
  }
}