

// Java program to find the sum of prime 
// factors of all numbers in range [L-R] 
class gfg { 
    static boolean isPrime(int n) 
    { 
        for (int i = 2; i * i <= n; i++) { 
  
            // n has a factor, hence not a prime 
            if (n % i == 0) 
                return false; 
        } 
        // we reach here if n has no factors 
        // and hence n is a prime number 
        return true; 
    } 
    static int sum(int l, int r) 
    { 
        int sum = 0; 
  
        // iterate from lower to upper 
        for (int i = l; i <= r; i++) { 
  
            // if i is prime, it has no factors 
            if (isPrime(i)) 
                continue; 
            for (int j = 2; j < i; j++) { 
  
                // check if j is a prime factor of i 
                if (i % j == 0 && isPrime(j)) 
                    sum += j; 
            } 
        } 
        return sum; 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        int l = 18, r = 25; 
        System.out.println(sum(l, r)); 
    } 
} 

