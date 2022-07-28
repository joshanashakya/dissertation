

// Java program to count number of 
// ways we can express a factorial 
// as sum of consecutive numbers 
import java.util.*; 
  
class GFG { 
      
    static int MAX = 50002; 
    static ArrayList<Integer> primes  
                 = new ArrayList<Integer>(); 
                   
    // sieve of Eratosthenes to compute 
    // the prime numbers 
    public static void sieve() 
    { 
          
        boolean isPrime[] = new boolean[MAX]; 
          
        for(int i = 0; i < MAX; i++) 
            isPrime[i] = true; 
              
        for (int p = 2; p * p < MAX; p++) { 
            if (isPrime[p] == true) { 
                for (int i = p * 2; i < MAX; i += p) 
                    isPrime[i] = false; 
            } 
        } 
          
        // Store all prime numbers 
        for (int p = 2; p < MAX; p++) 
            if (isPrime[p] == true) 
                primes.add(p); 
    } 
          
    // function to calculate the largest 
    // power of a prime in a number 
    public static int power(int x, int y) 
    { 
        int count = 0; 
        int z = y; 
        while (x >= z) { 
            count += (x / z); 
            z *= y; 
        } 
          
        return count; 
    } 
      
    // Modular multiplication to avoid 
    // the overflow of multiplication 
    // Please see below for details 
    // https://www.geeksforgeeks.org/how-to-avoid-overflow-in-modular-multiplication/ 
    public static int modMult(int a, int b, int mod) 
    { 
        int res = 0; 
        a = a % mod; 
        while (b > 0) { 
            if (b % 2 == 1) 
                res = (res + a) % mod; 
            a = (a * 2) % mod; 
            b /= 2; 
        } 
          
        return res % mod; 
    } 
      
    // Returns count of ways to express n! 
    // as sum of consecutives. 
    public static int countWays(int n, int m) 
    {  
        int ans = 1; 
      
        // We skip 2 (First prime) as we need to 
        // consider only odd primes 
        for (int i = 1; i < primes.size(); i++) { 
      
            // compute the largest power of prime 
            int powers = power(n, primes.get(i)); 
      
            // if the power of current prime number 
            // is zero in N!, power of primes greater 
            // than current prime number will also 
            // be zero, so break out from the loop 
            if (powers == 0) 
                break; 
      
            // multiply the result at every step 
            ans = modMult(ans, powers + 1, m) % m; 
        } 
      
        // subtract 1 to exclude the case of 1 
        // being an odd divisor 
        if (((ans - 1) % m) < 0) 
            return (ans - 1 + m) % m; 
        else
            return (ans - 1) % m; 
    } 
      
    //Driver function 
    public static void main (String[] args) { 
          
        sieve(); 
          
        int n = 4, m = 7;  
          
        System.out.println(countWays(n,m)); 
    } 
} 
  
// This code is contributed by akash1295. 

