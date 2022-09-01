package leetcode.problems.p100

import leetcode.problems.utils.TreeNode

object Solution {
  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }
}
