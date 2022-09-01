package leetcode.problems.p13

object Solution {

  val char2number = Map(
    'I' -> 1,
    'V' -> 5,
    'X' -> 10,
    'L' -> 50,
    'C' -> 100,
    'D' -> 500,
    'M' -> 1000
  )

  def romanToInt(s: String): Int = {
    var result = 0
    val reversed = s.reverse
    reversed.zipWithIndex.foreach{ case (chr, index) =>
      if (index > 0) {
        val prev = reversed(index - 1)
        if (chr == 'I' && (prev == 'V' || prev == 'X')) {
          result -= 1
        } else if (chr == 'X' && (prev == 'L' || prev == 'C')) {
          result -= 10
        } else if (chr == 'C' && (prev == 'D' || prev == 'M')) {
          result -= 100
        } else {
          result += char2number(chr)
        }
      } else {
        result += char2number(chr)
      }
    }
    result
  }
}