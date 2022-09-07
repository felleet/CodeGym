package leetcode.problems.p206

import leetcode.problems.utils.ListNode

object Solution {
  def reverseList(head: ListNode): ListNode = {
    if (head== null) return head

    var prev: ListNode = null
    var current = head

    while (current!=null) {
      val next = current.next
      current.next = prev
      prev = current
      current = next
    }
    prev
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    var node = Solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))))
    while (node != null) {
      println(node.x)
      node = node.next
    }
  }
}