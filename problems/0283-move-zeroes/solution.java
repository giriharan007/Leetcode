class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount=0;

        for(int num:nums){
            if(num!=0){
                nums[zeroCount++]=num;
            }
        }

        while(zeroCount<nums.length){
            nums[zeroCount++]=0;
        }
    }
}
