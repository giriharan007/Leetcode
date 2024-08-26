int mySqrt(int x) {
    long int start=1,end=x,mid;
    if(x==0 || x==1)
       return x;
    else{
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid==x)
               return mid;
            else if(x<mid*mid)
               end=mid-1;
            else
                start=mid+1;  

        }
        return end;
    }
          
}
