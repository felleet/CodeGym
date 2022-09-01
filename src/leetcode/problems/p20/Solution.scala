package leetcode.problems.p20

import scala.collection.mutable

object Solution {
  val opening: Seq[Char] = Seq('(', '{', '[')
  val open2close: Map[Char, Char] = Map(
    '(' -> ')',
    '{' -> '}',
    '[' -> ']'
  )
  def isValid(s: String): Boolean = {
    val stack = new mutable.Stack[Char]()
    for(char <- s) {
      if (opening.contains(char)) {
        stack.push(open2close(char))
      } else if (stack.isEmpty || stack.pop() != char){
          return false
      }
    }
    stack.isEmpty
  }
}
