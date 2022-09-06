package leetcode.problems.p121

object Solution {
  def maxProfit(prices: Array[Int]): Int = {
    var buyIndex = 0
    var profit = 0
    for (i <- prices.indices) {
      if (prices(i) < prices(buyIndex)) {
        buyIndex = i
      }
      val todaySellProfit = prices(i) - prices(buyIndex)
      if (todaySellProfit > profit) {
        profit = todaySellProfit
      }
    }
    profit
  }
}
