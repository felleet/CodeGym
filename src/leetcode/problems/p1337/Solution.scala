package leetcode.problems.p1337

object Solution {
  def kWeakestRows(mat: Array[Array[Int]], k: Int): Array[Int] = {
    mat.map(arr =>arr.sum)
      .zipWithIndex
      .sortWith {
        case ((sum1,_), (sum2,_))=> sum1 < sum2
      }
      .take(k)
      .map(_._2)
  }
}