class Solution {
    public boolean checkPowersOfThree(int n) {
        int c=0;
        int range = 1;
        while(range<n){
            range*=3;
            c++;
        }
        int arr[] = new int[c+1];
        int j=0;
         while (c >0) { 
            arr[j] = (int) Math.pow(3, c);
            c--;
            j++;
        }
        arr[j]=1;
         int sum=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
           if(n==sum) return true;
           else if(sum<n){
               continue;
           }
           else{
               sum=sum-arr[i];
           }
        }
        return false;
    }
}
