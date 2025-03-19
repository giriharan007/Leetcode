class Solution {
    public int minOperations(int[] nums){
        int c=0;
        int j=0;
        for(int  i=0;i<=nums.length-3;i++){
        if(nums[i]==0){
          j=i;
          while(j<i+3){
            nums[j]^=1; 
            j++;
          }
          c++;
        }
       } 
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=1)  return -1;
       }
       return c;
    }
}
