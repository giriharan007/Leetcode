void moveZeroes(int* nums, int numsSize) {
    int i = 0;
    
    while (i < numsSize) {
        if (nums[i] == 0) {
            for (int j = i; j < numsSize - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[numsSize - 1] = 0;
            numsSize--; 
        } else {
            i++;  
        }
    }
}

