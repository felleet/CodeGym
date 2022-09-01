package leetcode.problems.p383

object Solution2 {

  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val arr = Array.fill(26)(0)
    for (ch <- ransomNote) {
      arr(ch - 'a')+=1
    }
    var remaining = ransomNote.length
    for(ch <- magazine) {
      val i = ch - 'a'
      if (arr(i) > 0) {
        arr(i) -= 1
        remaining -= 1
      }

      if (remaining == 0) {
        return true
      }
    }
    remaining == 0
  }
}
