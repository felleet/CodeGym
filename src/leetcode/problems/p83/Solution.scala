package leetcode.problems.p83

import leetcode.problems.utils.ListNode

object Solution {
  def deleteDuplicates(head: ListNode): ListNode = {
    if (head == null) return null
    var prev = head
    var current = head.next
    while (current != null) {
      if (current.x == prev.x) {
        prev.next = current.next
      } else {
        prev = current
      }
      current = current.next
    }
    head
  }
}