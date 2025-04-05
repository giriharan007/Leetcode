class Solution {
    public int subsetXORSum(int[] nums) {
        return xor(nums,0,0);
    }

    public int xor(int[] nums,int indx,int sum){
           if(indx==nums.length) return sum;

           return xor(nums,indx+1,sum^nums[indx])+xor(nums,indx+1,sum);
    }
}
