package leetcode.problems.p112

import leetcode.problems.utils.TreeNode

object Solution {
  def hasPathSum(root: TreeNode, targetSum: Int): Boolean = {
    dive(root, 0, targetSum)
  }

  def dive(node: TreeNode, currentSum: Int, targetSum: Int): Boolean = {
    if (node == null) return false
    if (isLeaf(node)) {
      currentSum + node.value == targetSum
    } else {
      dive(node.left, currentSum + node.value, targetSum) || dive(node.right, currentSum + node.value, targetSum)
    }
  }

  def isLeaf(node: TreeNode): Boolean = node.left == null && node.right == null
}