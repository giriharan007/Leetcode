class Solution {
    public int firstMissingPositive(int[] nums) {
        int num=1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            else if(nums[i]>0 && nums[i]!=num) return num;
            else if(nums[i]>0) num++;
        }
        return num;
    }
}
