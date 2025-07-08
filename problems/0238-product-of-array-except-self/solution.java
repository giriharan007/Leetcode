class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        int zero=0;
        boolean valid;
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==0){
            valid=true;
            zero=i;
            count++; 
           }
           else{
             product*=nums[i];
           }
        }

        if(count==1){
        for(int i=0;i<nums.length;i++)
        {
           if(zero==i) nums[i]=product;
           else nums[i]=0;
        }
        }
        else if(count>1)  Arrays.fill(nums,0);
        else{
           for(int i=0;i<nums.length;i++)
        {
           nums[i]=product/nums[i];
        } 
        }
       return nums;
    }
}
