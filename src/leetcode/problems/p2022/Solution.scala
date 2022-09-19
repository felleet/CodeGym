package leetcode.problems.p2022

object Solution {
  def construct2DArray(original: Array[Int], m: Int, n: Int): Array[Array[Int]] = {
    if (m*n != original.length) return new Array[Array[Int]](0)
    val arr = new Array[Array[Int]](m)
    for(row <- 0 until m) {
      val rowArr = new Array[Int](n)
      for(cell <- 0 until n) {
        rowArr(cell) = original(row * n + cell)
      }
      arr(row) = rowArr
    }
    arr
  }
}