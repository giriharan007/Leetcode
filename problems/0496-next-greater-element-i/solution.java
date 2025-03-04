import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store the next greater element for each number in nums2
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2 to build the next greater element mapping
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num); // Store next greater element
            }
            stack.push(num);
        }
        
        // For remaining elements in stack, there is no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Fill result array for nums1 based on precomputed values in the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}

