package leetcode.problems.p234

import leetcode.problems.utils.ListNode

object Solution2 {
  def isPalindrome(head: ListNode): Boolean = {
    val middle = getMiddle(head)
    val reversedHead = reverse(middle)

    var first = head
    var second = reversedHead

    while (second != null) {
      if (first.x != second.x) {
        return false
      }
      first = first.next
      second = second.next
    }
    true
  }

  def reverse(node: ListNode):ListNode = {
    if (node == null || node.next == null) {
      return node
    }
    var tmp = node
    var first:ListNode = null
    while (tmp != null) {
      val next = tmp.next
      tmp.next = first
      first = tmp
      tmp = next
    }
    first
  }

  def getMiddle(node: ListNode):ListNode = {
    val isLast = node == null || node.next == null
    if (isLast) {
      return node
    }
    var slow = node
    var fast = node

    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }
}