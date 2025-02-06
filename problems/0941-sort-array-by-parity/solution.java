class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int temp=0;
        while(left<right){

            if(nums[left]%2==0){
                left++;
            }
            else if (nums[right]%2==1){
                right--;
            }
             
            else{
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }

           
        }
        return nums;
    }
}
