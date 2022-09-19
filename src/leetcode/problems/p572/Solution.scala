package leetcode.problems.p572

import leetcode.problems.utils.TreeNode

object Solution {
  def isSubtree(root: TreeNode, subRoot: TreeNode): Boolean = {
    if (root == null) return false
    if (isSameTree(root, subRoot)) return true
    isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
  }

  def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
    if (p == null && q == null) return true
    if (p == null || q == null) return false
    p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
  }
}
