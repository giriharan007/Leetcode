class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }

            else{
                c=0;
            }
            maxcount=Math.max(maxcount,c);
        }

        return maxcount;
    }
}
