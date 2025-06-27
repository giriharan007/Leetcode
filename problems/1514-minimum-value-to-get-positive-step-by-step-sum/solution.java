class Solution {
    public int minStartValue(int[] nums) {
       int min=0;
        int sum=0;
        for(int x:nums){
            sum+=x;
            min=Math.min(sum,min);
        }
        return 1-min;
      
     /*   int ans=1;
        int res=0;
        while(res<1){
          res=ans+nums[0];
           for(int i=1;i<nums.length;i++){
               res+=nums[i];
               if(res<1) break;
            }
             ans+=1;
        }
        return ans-1;*/
    }
}
