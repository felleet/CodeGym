package leetcode.problems.p543

import leetcode.problems.utils.TreeNode

object Solution {
  def diameterOfBinaryTree(root: TreeNode): Int = {
    if (root == null) return 0
    var sum = 0
    def maxDepth(root: TreeNode): Int = {
      if (root == null) return 0
      val left = maxDepth(root.left)
      val right = maxDepth(root.right)
      sum = sum max (left + right)
      left.max(right) + 1
    }
    maxDepth(root)
    sum
  }
}