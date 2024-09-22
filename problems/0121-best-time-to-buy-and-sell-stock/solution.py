class Solution(object):
    def maxProfit(self, prices):
        n=2**31-1
        max_profit=0
        for i in range (len(prices)):
            if prices[i]<n:
                n=prices[i]

            diff=prices[i]-n
            max_profit=max(diff,max_profit)
        return max_profit        
        
