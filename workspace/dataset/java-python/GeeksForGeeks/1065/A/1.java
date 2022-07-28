

// Java program to find XOR of 
// all Prime numbers in an Array 
// at positions divisible by K 
class GFG { 
  
    static int MAX = 1000005; 
    static boolean prime[] = new boolean[MAX]; 
      
    static void SieveOfEratosthenes(boolean []prime) 
    { 
        // 0 and 1 are not prime numbers 
        prime[1] = false; 
        prime[0] = false; 
      
        for (int p = 2; p * p < MAX; p++) { 
      
            // If prime[p] is not changed, 
            // then it is a prime 
            if (prime[p] == true) { 
      
                // Update all multiples of p 
                for (int i = p * 2;i < MAX; i += p) 
                    prime[i] = false; 
            } 
        } 
    } 
      
    // Function to find the required XOR 
    static void prime_xor(int arr[], int n, int k) 
    { 
          
        for(int i = 0; i < MAX; i++) 
            prime[i] = true; 
      
        SieveOfEratosthenes(prime); 
      
        // To store XOR of the primes 
        int ans = 0; 
      
        // Traverse the array 
        for (int i = 0; i < n; i++) { 
      
            // If the number is a prime 
            if (prime[arr[i]]) { 
      
                // If index is divisible by k 
                if ((i + 1) % k == 0) { 
                    ans ^= arr[i]; 
                } 
            } 
        } 
      
        // Print the xor 
        System.out.println(ans); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int arr[] = { 2, 3, 5, 7, 11, 8 }; 
        int n = arr.length; 
        int K = 2; 
      
        // Function call 
        prime_xor(arr, n, K); 
      
    } 
} 
  
// This code is contributed by Yash_R 

