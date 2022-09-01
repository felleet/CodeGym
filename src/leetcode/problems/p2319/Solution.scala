package leetcode.problems.p2319

object Solution {
  def checkXMatrix(grid: Array[Array[Int]]): Boolean = {
    var left = 0
    var right = grid(0).length - 1

    for (i <- grid.indices) {
      val row = grid(i)
      for (cellIndex <- row.indices) {

        if ((cellIndex == left || cellIndex == right) && row(cellIndex) == 0) {
          return false
        }

        if (cellIndex != left && cellIndex != right && row(cellIndex) != 0) {
          return false
        }
      }
      left += 1
      right -= 1
    }
    true
  }
}