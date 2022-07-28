

// Java implementation of the approach  
import java.util.*; 
  
class GfG  
{ 
  
static int N = 100005;  
  
// To check if a number is prime or not  
static boolean isprime[] = new boolean[N];  
  
// To store possible numbers  
static boolean can[] = new boolean[N];  
  
// Function to return all prime numbers  
static ArrayList<Integer>SieveOfEratosthenes()  
{  
      
    for(int a = 0 ; a < isprime.length; a++) 
    { 
        isprime[a] = true; 
    } 
    for (int p = 2; p * p < N; p++)  
    {  
  
        // If prime[p] is not changed, then it is a prime  
        if (isprime[p] == true) 
        {  
  
            // Update all multiples of p greater than or  
            // equal to the square of it  
            // numbers which are multiple of p and are  
            // less than p^2 are already been marked.  
            for (int i = p * p; i < N; i += p)  
                isprime[i] = false;  
        }  
    }  
  
    ArrayList<Integer> primes = new ArrayList<Integer> ();  
    for (int i = 2; i < N; i++)  
        if (isprime[i])  
            primes.add(i);  
  
    return primes;  
}  
  
// Function to count all possible prime numbers that can be  
// expressed as the sum of two consecutive primes and one  
static int Prime_Numbers(int n)  
{  
    ArrayList<Integer> primes = SieveOfEratosthenes();  
  
    // All possible prime numbers below N  
    for (int i = 0; i < (int)(primes.size()) - 1; i++)  
        if (primes.get(i) + primes.get(i + 1) + 1 < N)  
            can[primes.get(i) + primes.get(i + 1) + 1] = true;  
  
    int ans = 0;  
    for (int i = 2; i <= n; i++)  
    {  
        if (can[i] && isprime[i] == true)  
        {  
            ans++;  
        }  
    }  
  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int n = 50;  
    System.out.println(Prime_Numbers(n));  
} 
}  
  
// This code is contributed by  
// Prerna Saini. 

