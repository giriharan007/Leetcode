class Solution(object):
    def countSeniors(self, details):
        c=0
        for i in details:
            l=i[11:13]
            l=int(l)
            if(l>60):
                c+=1
        return c        
  
