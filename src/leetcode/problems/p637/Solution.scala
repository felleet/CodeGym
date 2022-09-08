package leetcode.problems.p637

import leetcode.problems.utils.TreeNode

object Solution {
  def averageOfLevels(root: TreeNode): Array[Double] = {
    val map = new collection.mutable.HashMap[Int, (Int, Double)]()
    val level = 1
    map.put(level, (1, root.value))
    dive(root.left, level + 1, map)
    dive(root.right, level + 1, map)
    map.values.map { case (count, sum) => sum / count }.toArray
  }

  def dive(node: TreeNode, level: Int, map: collection.mutable.HashMap[Int, (Int, Double)]):Unit = {
    if (node == null) return
    val (count, sum) = map.getOrElse(level, (0,0d))
    map.put(level, (count + 1, sum + node.value))
    dive(node.left, level + 1, map)
    dive(node.right, level + 1, map)
  }

}