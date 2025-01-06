class Solution(object):
    def minOperations(self, boxes):
        res=[0]*len(boxes)
        balls,moves=0,0

        for i in range(len(boxes)):
            res[i]=balls+moves
            moves=balls+moves
            balls+=int(boxes[i])

        balls,moves=0,0    
        
        for i in reversed(range(len(boxes))):
            res[i]+=balls+moves
            moves=balls+moves
            balls+=int(boxes[i])

        return res    
