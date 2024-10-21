int countPairs(int* nums, int numsSize, int k) {
    int c=0;
    for(int i=0;i<numsSize;i++){
       for(int  j=i;j<numsSize;j++){
          if(nums[i]==nums[j] &&i!=j){
             if((i*j)%k==0){
               c++;
             }
          }
       }
    }
    return c;

}
