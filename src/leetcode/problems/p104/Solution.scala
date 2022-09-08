package leetcode.problems.p104

import leetcode.problems.utils.TreeNode

object Solution {
  def maxDepth(root: TreeNode): Int = {
    if (root == null) return 0
    Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1)
  }
}