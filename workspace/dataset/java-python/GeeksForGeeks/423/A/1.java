

// Java implementation of the approach  
import java.util.HashMap; 
  
class GFG  
{ 
  
    static long MAXN = 100001L, mod = 1000000007L; 
  
    // To store the smallest prime factor 
    // for every number 
    static long[] spf = new long[(int) MAXN]; 
  
    // Initialize map to store 
    // count of prime factors 
    static HashMap<Long, Long> cnt = new HashMap<>(); 
  
    // Function to calculate SPF(Smallest Prime Factor) 
    // for every number till MAXN 
    public static void sieve()  
    { 
        spf[1] = 1; 
        for (int i = 2; i < MAXN; i++) 
  
            // Marking smallest prime factor for every 
            // number to be itself 
            spf[i] = i; 
  
        // Separately marking spf for every even 
        // number as 2 
        for (int i = 4; i < MAXN; i += 2) 
            spf[i] = 2; 
  
        for (int i = 3; i * i < MAXN; i++)  
        { 
  
            // Checking if i is prime 
            if (spf[i] == i) { 
  
                // Marking SPF for all numbers divisible by i 
                for (int j = i * i; j < MAXN; j += i) 
  
                    // Marking spf[j] if it is not 
                    // previously marked 
                    if (spf[j] == j) 
                        spf[j] = i; 
            } 
        } 
    } 
  
    // Function to factorize using spf 
    // and store in cnt 
    public static void factorize(long f) 
    { 
        while (f > 1)  
        { 
            long x = spf[(int) f]; 
            while (f % x == 0)  
            { 
                if (cnt.containsKey(x))  
                { 
                    long z = cnt.get(x); 
                    cnt.put(x, ++z); 
                }  
                else
                    cnt.put(x, (long) 1); 
                f /= x; 
            } 
        } 
    } 
  
    // Function to return n! % p 
    public static long factorial(long n, long p) 
    { 
  
        // Initialize result 
        long res = 1; 
        for (long i = 2; i <= n; i++) 
            res = (res * i) % p; 
        return res; 
    } 
  
    // Iterative Function to calculate (x^y)%p 
    // in O(log y) 
    public static long power(long x, long y, long p)  
    { 
  
        // Initialize result 
        long res = 1; 
  
        // Update x if it is >= p 
        x = x % p; 
  
        while (y > 0) { 
  
            // If y is odd, multiply x with result 
            if (y % 2 == 1) 
                res = (res * x) % p; 
  
            // y must be even now 
            // y = y/2 
            y = y >> 1; 
            x = (x * x) % p; 
        } 
        return res; 
    } 
  
    // Function that returns n^(-1) mod p 
    public static long modInverse(long n, long p)  
    { 
        return power(n, p - 2, p); 
    } 
  
    // Function that returns nCr % p 
    // using Fermat's little theorem 
    public static long nCrModP(long n, long r, long p) 
    { 
        // Base case 
        if (r == 0) 
            return 1; 
  
        // Fill factorial array so that we 
        // can find all factorial of r, n 
        // and n - r 
        long[] fac = new long[(int) n + 1]; 
        fac[0] = 1; 
        for (int i = 1; i <= n; i++) 
            fac[i] = fac[i - 1] * i % p; 
  
        return (fac[(int) n] * modInverse(fac[(int) r], p) % p *  
                modInverse(fac[(int) (n - r)], p) % p) % p; 
    } 
  
    // Function to return the count the number of possible 
    // arrays mod P of length K such that the product of all 
    // elements of that array is equal to the product of 
    // all elements of the given array of length N 
    public static long countArrays(long[] arr,  
                                   long N, long K, long P) 
    { 
        // Initialize result 
        long res = 1; 
  
        // Call sieve to get spf 
        sieve(); 
  
        for (int i = 0; i < N; i++)  
        { 
  
            // Factorize arr[i], count and 
            // store its factors in cnt 
            factorize(arr[i]); 
        } 
  
        for (HashMap.Entry<Long, Long> entry : cnt.entrySet()) 
        { 
            long ci = entry.getValue(); 
            res = (res * nCrModP(ci + K - 1, K - 1, P)) % P; 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        long[] arr = { 1, 3, 5, 2 }; 
        long K = 3; 
        long N = arr.length; 
        System.out.println(countArrays(arr, N, K, mod)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

