void rotate(int* nums, int numsSize, int k) {
    int n=k%numsSize;
    int arr[numsSize],j=0;
    for(int i=numsSize-n;i<numsSize;i++){
        arr[j++]=nums[i];
    }

    for(int i=0;i<numsSize-n;i++){
        arr[j++]=nums[i];
    }

    for(int i=0;i<numsSize;i++){
        nums[i]=arr[i];
    }


}
