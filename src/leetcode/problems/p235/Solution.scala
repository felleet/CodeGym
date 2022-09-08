package leetcode.problems.p235

import leetcode.problems.utils.TreeNode

import scala.collection.mutable

object Solution {
  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    if (root.value > p.value && root.value > q.value) {
      lowestCommonAncestor(root.left, p, q)
    } else if (root.value < p.value && root.value < q.value) {
      lowestCommonAncestor(root.right, p, q)
    } else {
      root
    }
  }
}