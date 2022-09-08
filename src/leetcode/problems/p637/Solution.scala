package leetcode.problems.p637

import leetcode.problems.utils.TreeNode

object Solution {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    val map = new collection.mutable.HashMap[Int, (Int, Double)]()
    val level = 1
    map.put(level, (1, root.value))

    def dive(node: TreeNode, level: Int): Unit = {
      if (node == null) return
      val (count, sum) = map.getOrElse(level, (0, 0d))
      map.put(level, (count + 1, sum + node.value))
      dive(node.left, level + 1)
      dive(node.right, level + 1)
    }

    dive(root.left, level + 1)
    dive(root.right, level + 1)
    map.values.map { case (count, sum) => sum / count }.toArray
  }
}