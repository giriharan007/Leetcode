

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); 
        int min = 0;
        int sum = 0;
        int temp2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) { 
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
               
                
                int temp = sum - target;
                if (Math.abs(temp) < Math.abs(temp2)) {
                    min = sum;
                    temp2 = temp;
                }

                
                if (sum < target) {
                    l++;
                } else if (sum > target) {
                    r--;
                } else {
                    return sum; 
                }
            }
        }
        return min;
    }
}

