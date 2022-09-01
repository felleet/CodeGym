package leetcode.problems.p383

import scala.collection.mutable

object Solution {

  def canConstruct(ransomNote: String, magazine: String): Boolean = {
    val magStats = getStats(magazine)
    val ransomeNoteStats = getStats(ransomNote)
    for( (ch, count ) <- ransomeNoteStats) {
      val mag = magStats.get(ch)
      if (mag.isEmpty || mag.get < count) {
        return false
      }
    }
    true
  }

  def getStats(magazine: String):mutable.HashMap[Char, Int] = {
    magazine.foldLeft(new mutable.HashMap[Char, Int]()) {
      case (map, ch) =>
        val x = map.getOrElse(ch, 0)
        map.put(ch, x + 1)
        map
    }
  }
}