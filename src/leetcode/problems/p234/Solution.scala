package leetcode.problems.p234

import leetcode.problems.utils.ListNode

import scala.collection.mutable

object Solution {
  def isPalindrome(head: ListNode): Boolean = {
    val arr = new mutable.ArrayBuffer[Int]()
    var node = head
    do {
      arr.addOne(node.x)
      node = node.next
    } while (node != null)

    var j = arr.length - 1
    for (i <- arr.indices) {
      val lower = arr(i)
      val higher = arr(j)
      if (lower != higher) {
        return false
      }
      j -= 1
    }
    true
  }
}