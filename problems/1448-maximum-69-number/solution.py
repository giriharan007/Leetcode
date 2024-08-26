class Solution(object):
    def maximum69Number (self, num):
        temp=num
        s=str(num)
        for i in range(0,len(s)):
            if(s[i]=="6"):
                val=int(s[:i]+"9"+s[i+1:])
            else:
                 val=int(s[:i]+"6"+s[i+1:])
            temp=max(temp,val)     
        return temp

        
        
