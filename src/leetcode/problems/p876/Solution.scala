package leetcode.problems.p876

import leetcode.problems.utils.ListNode

object Solution {
  def middleNode(head: ListNode): ListNode = {
    var slow = head
    var fast = head

    while(fast != null && fast.next!=null) {
      fast = fast.next.next
      slow = slow.next
    }
    slow
  }
}
