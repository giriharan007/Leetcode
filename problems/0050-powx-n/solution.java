class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long n1=n;
        double ans;
        if(n1<0) return ans=1/Math.pow(x,-n1);
        return ans=Math.pow(x,n1);
        
    }
}
