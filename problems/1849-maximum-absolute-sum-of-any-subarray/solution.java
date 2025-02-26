class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=0;
         int min=0;
         int curr=0;
         int res=0;
  
        for(int val:nums){
             curr+=val;
             res=Math.max(res,Math.max(Math.abs(curr-min),Math.abs(curr-max)));
             max=Math.max(max,curr);
             min=Math.min(min,curr);
            }
        
        return res;
    }
}
