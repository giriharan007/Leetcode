class Solution(object):
    def maxScore(self, s):
        count=Counter(s)
        zero,one=0,0
        res=[]
        for num in range(len(s)-1):
            count[s[num]]-=1
            print(count)

            if(int(s[num])==0):
                zero+=1
                nums=zero+count['1']
                res.append(nums)

            else:
                one+=1
                nums=zero+count['1']
                res.append(nums)    
        
        return max(res)
