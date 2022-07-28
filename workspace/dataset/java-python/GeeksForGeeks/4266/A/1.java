

// Java implementation of the approach 
  
class GFG 
{ 
        
    static final int MAX=1000000; 
    static boolean []prime=new boolean[MAX + 1]; 
    static void SieveOfEratosthenes() 
    { 
        // Create a boolean array "prime[0..n]" and initialize 
        // all the entries as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        for(int i=0;i<=MAX;i++) 
            prime[i]=true; 
      
        // 0 and 1 are not prime numbers 
        prime[1] = false; 
        prime[0] = false; 
      
        for (int p = 2; p * p <= MAX; p++) { 
      
            // If prime[p] is not changed, then it is a prime 
            if (prime[p] == true) { 
      
                // Update all multiples of p 
                for (int i = p * 2; i <= MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
      
    // compute the answer 
    static void solve(int []arr, int n, int k) 
    { 
        // count of primes 
        int c = 0; 
      
        // sum of the primes 
        long  sum = 0; 
      
        // traverse the array 
        for (int i = 0; i < n; i++) { 
      
            // if the number is a prime 
            if (prime[arr[i]]) { 
      
                // increase the count 
                c++; 
      
                // if it is the K'th prime 
                if (c % k == 0) { 
                    sum += arr[i]; 
                    c = 0; 
                } 
            } 
        } 
        System.out.println(sum); 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
      
        // create the sieve 
        SieveOfEratosthenes(); 
      
        int n = 5, k = 2; 
      
        int []arr = { 2, 3, 5, 7, 11 }; 
      
        solve(arr, n, k); 
      
    } 
  
} 

