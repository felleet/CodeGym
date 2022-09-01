package leetcode.problems.p1356

object Solution {
  def sortByBits(arr: Array[Int]): Array[Int] = {
    val x = arr.map(x => {
      (x, Integer.bitCount(x))
    })
    println("x=" +x.mkString("Array(", ", ", ")"))
    val y = x.sortWith{case ((x1, y1),(x2, y2))=> {
      if (y1 == y2) {
        x1.compare(x2) < 0
      } else {
        y1.compare(y2) < 0
      }
    }}
    println("y=" + y.mkString("Array(", ", ", ")"))
    y.map(_._1)
  }
}
