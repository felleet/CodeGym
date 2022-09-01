package leetcode.problems.p830

object Solution {
  def largeGroupPositions(s: String): List[List[Int]] = {
    var start = 0
    var end = 0
    val result = collection.mutable.ListBuffer[List[Int]]()
    for (i <- 1 until s.length) {
      if (s(i) == s(start)) {
        end = i
      } else {
        result += List(start, end)
        start = i
        end = i
      }
      if (end == s.length -1 ) {
        result += List(start, end)
      }
    }

    result
      .filter(x => x(1) - x(0) >= 2)
      .sortWith{
        case (x1, x2) => x1.head.compare(x2.head) < 0
      }
      .toList
  }
}