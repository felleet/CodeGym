package leetcode.problems.p617

import leetcode.problems.utils.TreeNode

object Solution {
  def mergeTrees(root1: TreeNode, root2: TreeNode):TreeNode = {
    if (root1 == null) return root2
    if (root2 == null) return root1
    root1.value += root2.value
    root1.left = mergeTrees(root1.left, root2.left)
    root1.right = mergeTrees(root1.right, root2.right)
    root1
  }
}