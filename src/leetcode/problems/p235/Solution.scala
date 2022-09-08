package leetcode.problems.p235

import leetcode.problems.utils.TreeNode

import scala.collection.mutable

object Solution {
  def lowestCommonAncestor(root: TreeNode, p: TreeNode, q: TreeNode): TreeNode = {
    val left = new collection.mutable.Stack[TreeNode]()
    val right = new collection.mutable.Stack[TreeNode]()
    search(root, p, left)
    search(root, q, right)

    while (left.length != right.length && left.top != right.top) {
      if (left.length > right.length) {
        left.pop()
      } else {
        right.pop()
      }
    }
    left.pop()
  }

  def search(node: TreeNode, target: TreeNode, path: collection.mutable.Stack[TreeNode]): Boolean = {
    if (node == null) {
      return false
    }
    path.push( node)
    if (node.value == target.value) {
      return true
    }
    if (search(node.left, target, path)) {
      return true
    }
    if (search(node.right, target, path)) {
      return true
    }
    path.pop()
    false
  }
}