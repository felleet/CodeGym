package leetcode.problems.p556

import java.util

object Solution {
  def nextGreaterElement(n: Int): Int = {
    if (n < 10) {
      return -1
    }

    val origin = n.toString.toCharArray
    val sorted = origin.sorted
    val reversed = sorted.reverse
    if (reversed sameElements origin) {
      return -1
    }
    val lowBound = (origin.length - 1 until 0 by -1).find { i =>
      origin(i-1) < origin(i)
    }

    if (lowBound.isEmpty) {
      return -1
    }

    var i = lowBound.get
    val x = origin(i-1)
    var smallest = i

    for (j <- i+1 until origin.length) {
      if (origin(j) > x && origin(j) <= origin(smallest)){
        smallest = j
      }
    }
    val tmp = origin(i-1)
    origin(i-1) = origin(smallest)
    origin(smallest) = tmp

    util.Arrays.sort(origin, i, origin.length)

    try {
      new String(origin).toInt
    } catch {
      case err: Throwable => -1
    }
  }
}