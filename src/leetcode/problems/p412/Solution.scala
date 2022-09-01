package leetcode.problems.p412

object Solution {
  def fizzBuzz(n: Int): List[String] = {
    var fizz = 0
    var buzz = 0
    (for (i <- 1 to n) yield {
      fizz += 1
      buzz += 1
      ((fizz == 3, buzz == 5) match {
        case (true, true) => fizz = 0; buzz = 0; "FizzBuzz"
        case (true, _) => fizz = 0; "Fizz"
        case (_, true) => buzz = 0; "Buzz"
        case _ => i.toString
      })
    }).toList
  }
}