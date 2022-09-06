package leetcode.problems.p203

import leetcode.problems.utils.ListNode

object Solution {
  def removeElements(head: ListNode, x: Int): ListNode = {
    var first: ListNode = null
    var previous = head
    var current = head
    while (current != null) {
      if (current.x == x) {
        previous.next = current.next
      } else {
        if (first == null){
          first = current
        }
        previous = current
      }
      current = current.next
    }
    first
  }
}