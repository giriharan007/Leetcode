int findFinalValue(int* nums, int numsSize, int original) {
    for(int i=0;i<numsSize;i++){
        if(original==nums[i]){
            original*=2;
            i=-1;
        }
    }
    return original;
}
