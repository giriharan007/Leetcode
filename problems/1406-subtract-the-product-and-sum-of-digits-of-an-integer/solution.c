int subtractProductAndSum(int n) {
    int product=1,sum=0,rem=0;
    while(n!=0){
        rem=n%10;
        product=product*rem;
        sum=sum+rem;
        n=n/10;
    }

    return product-sum;
}
