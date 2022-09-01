package leetcode.problems.p1

object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = new collection.mutable.HashMap[Int, Int]()
    var resut = Array(0, 0)
    nums.indices.foreach { i =>
      val number = nums(i)
      if (map.contains(target - number)){
        resut = Array(map(target - number), i)
        return resut
      }
      map.put(number, i)
    }
    resut
  }
}