package leetcode.problems.p111

import leetcode.problems.utils.TreeNode

object Solution {
  def minDepth(root: TreeNode): Int = {
    if (root == null) return 0
    dive(root, 1)
  }

  def dive(node: TreeNode, level: Int):Int = {
    if (isLeaf(node)) return level
    if (node.left != null && node.right == null) {
      dive(node.left, level + 1)
    } else if (node.left == null && node.right != null) {
      dive(node.right, level + 1)
    } else {
      val minLeft = dive(node.left, level + 1)
      val minRight = dive(node.right, level + 1)
      if (minLeft < minRight) minLeft else minRight
    }
  }

  def isLeaf(node:TreeNode): Boolean = node.left == null && node.right == null
}