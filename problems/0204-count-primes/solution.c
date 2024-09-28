// int countPrimes(int n) {
//     // int c=0,flag=0;
//     for(int i=2;i<n;i++){
//         flag=0;
//         for(int j=2;j<i;j++){
//             if(i%j==0){
//                 flag=1;
//                 break;
//             }
//             else{
//                 flag=0;
//             }
//         }
//         if(flag==0){
//             c++;
//         }    
//         }
//     return c;
    
// }


int countPrimes(int n) {
    if (n <= 2) return 0;  // No primes less than 2

    // Create a boolean array "isPrime" and initialize all entries as true
    bool isPrime[n];
    for (int i = 0; i < n; i++) {
        isPrime[i] = true;
    }

    // 0 and 1 are not prime numbers
    isPrime[0] = isPrime[1] = false;

    // Implementing the Sieve of Eratosthenes
    for (int i = 2; i <sqrt(n); i++) {
        if (isPrime[i]) {
            // Mark all multiples of i as non-prime
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Count the number of primes
    int primeCount = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) {
            primeCount++;
        }
    }

    return primeCount;
}

