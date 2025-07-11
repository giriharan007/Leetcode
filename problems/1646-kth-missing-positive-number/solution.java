class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        boolean valid=true;
        for(int i=0;i<arr.length;i++){
            if(num!=arr[i]){
                valid=false;
                break;
            }
            num++;
        }
        if(valid) return arr[arr.length-1]+k;
        int i = 0; 
        int j = 0; 
        num = 1; 
        int[] missing = new int[k];
        while (j < k) {
            if (i < arr.length) {
                if (arr[i] != num) {
                    missing[j] = num;
                    num++;
                    j++;
                } 
                else {
                    i++;
                    num++;
                }
            } else {
                missing[j] = num;
                num++;
                j++;
            }
        }
        return missing[k-1];
    }
}
