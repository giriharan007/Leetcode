class Solution(object):
    def addBinary(self, a, b):
       result=[]
       carry=0
       i,j=len(a)-1,len(b)-1
       while i>=0 or j>=0 or carry:
        if i>=0:
            carry+=int(a[i])
            i-=1
        if j>=0:
            carry+=int(b[j])
            j-=1
        result.append(str(carry%2))
        carry//=2
       return ''.join(result[::-1])            
