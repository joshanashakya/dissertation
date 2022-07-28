

//Java implementation of above approach  
  
class GFG { 
  
static final int MAXN = 100001; 
static boolean prime[] = new boolean[MAXN];  
  
static void SieveOfEratosthenes()  
{  
  
    // Create a boolean array "prime[0..n]" and initialize  
    // all entries it as true. A value in prime[i] will  
    // finally be false if i is Not a prime, else true.  
  
        for(int i = 0;i<prime.length;i++) 
            prime[i]=true; 
  
    // 0 and 1 are not prime numbers  
    prime[0] = false;  
    prime[1] = false;  
  
    for (int p = 2; p * p < MAXN; p++) {  
  
        // If prime[p] is not changed, then it is a prime  
        if (prime[p] == true) {  
  
            // Update all multiples of p as non-prime  
            for (int i = p * p; i < MAXN; i += p)  
                prime[i] = false;  
        }  
    }  
}  
  
// Find the common prime divisors  
static void common_prime(int a, int b)  
{  
  
    // Get the GCD of the given numbers  
    int gcd = (int) __gcd(a, b);  
  
    // Find the prime divisors of the gcd  
    for (int i = 2; i <= (gcd); i++) {  
  
        // If i is prime and a divisor of gcd  
        if (prime[i] && gcd % i == 0) {  
            System.out.print(i + " ");  
        }  
    }  
}  
static long __gcd(long a, long b)   
{   
    if (a == 0)   
        return b;   
    return __gcd(b % a, a);   
}  
// Driver code  
    public static void main(String[] args) { 
        // Create the Seive  
    SieveOfEratosthenes();  
  
    int a = 6, b = 12;  
  
    common_prime(a, b);  
    } 
} 
  
/*This code is contributed by 29AjayKumar*/

