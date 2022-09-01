package leetcode.problems.p345

object Solution {
  val vowels = Seq('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
  def reverseVowels(s: String): String = {
    val sb = new StringBuilder(s)
    var end = s.length -1
    for (i <- 0 until end) {
      val left = s(i)
      if (i == end) {
        return sb.toString()
      }
      if (vowels.contains(left)){
        var searching = true
        var j = end
        while (j >= i && searching) {
          val right = s(j)
          if (vowels.contains(right)) {
            sb.setCharAt(i, right)
            sb.setCharAt(j, left)
            searching = false
          }
          j -= 1
          end = j
        }
      }
    }
    sb.toString()
  }
}
