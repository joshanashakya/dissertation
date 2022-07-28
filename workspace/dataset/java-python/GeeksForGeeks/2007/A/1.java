

// Java implementation of the approach  
class GFG  
{ 
static final int MAX = 10000; 
  
// Create a boolean array "prime[0..n]"  
// and initialize all entries it as true.  
// A value in prime[i] will finally be false 
// if i is Not a prime, else true.  
static boolean prime[] = new boolean [MAX + 1];  
  
static void SieveOfEratosthenes()  
{  
    int i ; 
    for (i = 0; i < MAX + 1; i++) 
    { 
        prime[i] = true; 
    } 
  
    prime[1] = false;  
  
    for (int p = 2; p * p <= MAX; p++)  
    {  
  
        // If prime[p] is not changed,  
        // then it is a prime  
        if (prime[p] == true)  
        {  
  
            // Set all multiples of p to non-prime  
            for (i = p * 2; i <= MAX; i += p)  
                prime[i] = false;  
        }  
    }  
}  
  
// Function to return the xor of  
// 1st N prime numbers  
static int xorFirstNPrime(int n)  
{  
    // Count of prime numbers  
    int count = 0, num = 1;  
  
    // XOR of prime numbers  
    int xorVal = 0;  
  
    while (count < n) 
    {  
  
        // If the number is prime xor it  
        if (prime[num])  
        {  
            xorVal ^= num;  
  
            // Increment the count  
            count++;  
        }  
  
        // Get to the next number  
        num++;  
    }  
    return xorVal;  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    // Create the sieve  
    SieveOfEratosthenes();  
  
    int n = 4;  
  
    // Find the xor of 1st n prime numbers  
    System.out.println(xorFirstNPrime(n));  
  
}  
} 
  
// This code is contributed by AnkitRai01 

