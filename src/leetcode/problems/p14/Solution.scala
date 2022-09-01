package leetcode.problems.p14

object Solution {
  def longestCommonPrefix(strs: Array[String]): String = {
    val sb = new StringBuffer
    val str = strs(0)
    for (i <- 0 until str.length) {
      val letter = str(i)
      if (strs.forall(x => x.length > i && x.charAt(i) == letter)){
        sb.append(letter)
      } else {
        return sb.toString
      }
    }
    sb.toString
  }
}
