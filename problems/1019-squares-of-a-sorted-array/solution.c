/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize) {
    *returnSize = numsSize;
    
    // Allocate memory for the result array
    int* result = (int*)malloc(numsSize * sizeof(int));
    
    // Two pointers: one at the start and one at the end
    int left = 0;
    int right = numsSize - 1;
    
    // Fill the result array from the last position down to the first
    for (int i = numsSize - 1; i >= 0; i--) {
        int leftSquare = nums[left] * nums[left];
        int rightSquare = nums[right] * nums[right];
        
        // Compare the squares and place the larger one at the current position
        if (leftSquare > rightSquare) {
            result[i] = leftSquare;
            left++;
        } else {
            result[i] = rightSquare;
            right--;
        }
    }
    
    return result;
}

