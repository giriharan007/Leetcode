int commonFactors(int a, int b) {
   int max= a < b ? a : b;
   int c=0;
   for(int i=1;i<=max;i++){
    if(a%i==0 && b%i==0){
        c++;
    }
   }
  return c;

}
