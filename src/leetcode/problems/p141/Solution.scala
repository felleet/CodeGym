package leetcode.problems.p141

import leetcode.problems.utils.ListNode

object Solution {
  def hasCycle(head: ListNode): Boolean = {
    if (head == null) return false
    var slow = head
    var fast = head.next

    while (fast != null && fast.next != null) {
      if (fast == slow) return true
      slow = slow.next
      fast = fast.next.next
    }
    false
  }
}