

// Java implementation of the above approach 
  
class GFG 
{ 
    // Function to find primes 
    static void sieve(int maxm, int []prime) 
    { 
        prime[0] = prime[1] = 1; 
  
        for (int i = 2; i * i <= maxm; i++) 
            if (prime[i]==0) 
                for (int j = 2 * i; j <= maxm; j += i) 
                    prime[j] = 1; 
    } 
  
    static long countPair(int []a, int n) 
    { 
        // Find the maximum element of the array 
        int maxm = a[0]; 
          
        int i; 
        for( i = 1; i < n ; i++) 
            if(a[i] > maxm) 
                maxm = a[i]; 
          
        int [] prime = new int[maxm + 1]; 
          
        for( i = 0; i < maxm + 1 ;i++) 
            prime[i] = 0; 
              
        // Find primes upto maximum 
        sieve(maxm, prime); 
      
        // Count number of primes 
        int countPrimes = 0; 
        for ( i = 0; i < n; i++) 
            if (prime[a[i]] == 0) 
                countPrimes++; 
      
        int nonPrimes = n - countPrimes; 
        long pairswith1Prime = nonPrimes *  
                                countPrimes; 
        long pairsWith2Primes = (countPrimes *  
                            (countPrimes - 1)) / 2; 
      
        return pairswith1Prime + pairsWith2Primes; 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        int [] arr = { 2, 3, 5, 4, 7 }; 
        int n = arr.length; 
      
        System.out.println(countPair(arr, n)); 
    } 
} 
  
// This code is contributed by ihritik  

