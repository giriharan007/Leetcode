int climbStairs(int n) {
    int one=1,total=0,two=1;
    if(n==1)
      return n;
    for(int i=0;i<n-1;i++){
        total=one+two;
        two=one;
        one=total;
    }
    return total;
}
