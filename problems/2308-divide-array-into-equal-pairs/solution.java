class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        
        for (int val : nums) {
            count[val]++;
        }
        
        for (int num : count) {
            if (num % 2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}

