package leetcode.problems.p1078

object Solution {
  def findOcurrences(text: String, first: String, second: String): Array[String] = {
    val words = text.split(" ")
    if (words.length < 3) {
      Array[String]()
    } else {
      import scala.collection.mutable.ArrayBuffer
      val result = new ArrayBuffer[String]
      for (i <- 0 until words.length - 2) {
        if (words(i).equals(first) && words(i + 1).equals(second)) {
          result += words(i + 2)
        }
      }
      result.toArray
    }
  }
}
