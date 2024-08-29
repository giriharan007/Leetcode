bool isPowerOfTwo(int n) 
{
   if(n>=1 && (n & (n-1))==0)
       return true;
    return false;   
    
}
/*{
    int m=INT_MAX;
    if(n==1)
    {
        return true;
    }
    int t=2;
    for(int i=1;i<31;i++)
    {
        if(t<m)
        {
        if(n==t)
        {
            return true;
        }
        t=t*2;
        }
    }
    return false;
}*/
