int mostFrequentEven(int* nums, int numsSize) {
    int min=-1,max=0,temp;
        for (int i = 0; i < numsSize - 1; i++) {
        for (int j = 0; j < numsSize - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                // Swap elements if they are in the wrong order
                temp = nums[j];
                nums[j] = nums[j + 1];
                nums[j + 1] = temp;
            }
        }
    }
    for(int i=0;i<numsSize;i++){
        int c=0;
        if(nums[i]%2==0){
        for(int j=i;j<numsSize;j++){
            if(nums[i]==nums[j]){
                c++;
            }   
        }
        if(c>max){
            max=c;
            min=nums[i];
        }
    }   
    } 
    return min;
    
}
