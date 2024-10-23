int hammingDistance(int x, int y) {
    int n,count=0;
    n = x^y;
    while(n!=0){
        count++;
        n = n&(n-1);
    }
return count;
}
