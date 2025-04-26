
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int maxLength = 0;
        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[start] > 1) {
                start++;
            }
            if (nums[end] - nums[start] == 1) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }

        return maxLength;
    }
}

