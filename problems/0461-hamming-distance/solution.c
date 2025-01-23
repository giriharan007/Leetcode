int hammingDistance(int x, int y) {
    int n,count=0;
    n = x^y;
    while(n!=0){
      count=count +(n&1);
      n=n>>1;
    }
return count;
}
