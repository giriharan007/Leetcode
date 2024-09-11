class Solution(object):
    def canCompleteCircuit(self, gas, cost):
        if sum(gas) < sum(cost):
            return -1
            
        start, tank = 0, 0
        for x in range(len(gas)):
            tank += gas[x] - cost[x]
            
            if tank < 0:
                start = x + 1
                tank = 0
                
        return start

