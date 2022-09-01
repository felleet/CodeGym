package leetcode.problems.p1304

object Solution {
  def sumZero(n: Int): Array[Int] = {
    val arr= collection.mutable.ArrayBuffer[Int]()
    for (i <- 1 to n / 2) yield {
      arr.addOne(i)
      arr.addOne(-i)
    }
    if (n % 2 != 0) {
      arr.addOne(0)
    }
    arr.toArray
  }
}