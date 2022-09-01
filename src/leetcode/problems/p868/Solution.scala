package leetcode.problems.p868

object Solution {
  def binaryGap(n: Int): Int = {
    var result = 0
    var num = n
    var i = 0
    var lastOneIndex = -1
    while (num != 0) {
      i +=1
      if ((num & 1) == 1){
        if (lastOneIndex != -1 ){
          result = Math.max(result, i - lastOneIndex)
        }
        lastOneIndex = i
      }
      num >>= 1
    }
    result
  }
}