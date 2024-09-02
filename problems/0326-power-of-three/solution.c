bool isPowerOfThree(int n) {
   /* long int i,t;
    if(n==0)
       return false;
     if(n==1)
       return true;

    t=3; 
    for(i=1;i<=32;i++){
       if(n==t){
        return true;
       }
    t=3*t; 
    }  
    return false;
}*/

if(n<=1){
    return n==1;
}
return n%3==0 && isPowerOfThree(n/3);
}
