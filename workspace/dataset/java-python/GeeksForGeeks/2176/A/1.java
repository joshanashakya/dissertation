

// Java program to find k-th prime factor 
// using Sieve Of Eratosthenes. This  
// program is efficient when we have  
// a range of numbers. 
class GFG 
{ 
static int MAX = 10001;  
  
// Using SieveOfEratosthenes to find smallest prime  
// factor of all the numbers.  
// For example, if MAX is 10,  
// s[2] = s[4] = s[6] = s[10] = 2  
// s[3] = s[9] = 3  
// s[5] = 5  
// s[7] = 7  
static void sieveOfEratosthenes(int []s)  
{  
      
    // Create a boolean array "prime[0..MAX]" and  
    // initialize all entries in it as false.  
    boolean[] prime=new boolean[MAX+1];  
  
    // Initializing smallest factor equal to 2  
    // for all the even numbers  
    for (int i = 2; i <= MAX; i += 2)  
        s[i] = 2;  
  
    // For odd numbers less then equal to n  
    for (int i = 3; i <= MAX; i += 2)  
    {  
        if (prime[i] == false)  
        {  
            // s(i) for a prime is the number itself  
            s[i] = i;  
  
            // For all multiples of current prime number  
            for (int j = i; j * i <= MAX; j += 2)  
            {  
                if (prime[i * j] == false)  
                {  
                    prime[i * j] = true;  
  
                    // i is the smallest prime factor for  
                    // number "i*j".  
                    s[i * j] = i;  
                }  
            }  
        }  
    }  
}  
  
// Function to generate prime factors  
// and return its k-th prime factor.  
// s[i] stores least prime factor of i.  
static int kPrimeFactor(int n, int k, int []s)  
{  
    // Keep dividing n by least  
    // prime factor while either  
    // n is not 1 or count of  
    // prime factors is not k.  
    while (n > 1)  
    {  
        if (k == 1)  
        return s[n];  
  
        // To keep tract of count of prime factors  
        k--;  
  
        // Divide n to find next prime factor  
        n /= s[n];  
    }  
    return -1;  
}  
  
// Driver code  
public static void main (String[] args)  
{ 
      
    // s[i] is going to store prime factor  
    // of i.  
    int[] s = new int[MAX + 1];  
    sieveOfEratosthenes(s);  
  
    int n = 12, k = 3;  
    System.out.println(kPrimeFactor(n, k, s));  
    n = 14; 
    k = 3;  
    System.out.println(kPrimeFactor(n, k, s));  
}  
} 
  
// This code is contributed by mits 

