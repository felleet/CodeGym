package leetcode.problems.p226

import leetcode.problems.utils.TreeNode

object Solution {
  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) return null
    val tmp = root.left
    root.left = root.right
    root.right = tmp
    invertTree(root.left)
    invertTree(root.right)
    root
  }
}