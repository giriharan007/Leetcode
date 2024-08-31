int missingNumber(int* nums, int numsSize) {
    int i,n=numsSize;
    int sum=n*(n+1)/2;

    for(i=0;i<numsSize;i++){
        sum=sum-nums[i];

    }
    return sum;
    
}
