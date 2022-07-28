

// Java implementation of prime pairs  
// whose sum is less than n  
  
class GFG 
{ 
      
// Sieve of Sundaram for generating  
// prime numbers less than n  
static void SieveOfSundaram(boolean marked[], int nNew)  
{  
      
    // Main logic of Sundaram. Mark all numbers  
    // of the form i + j + 2ij as true where  
    // 1 <= i <= j  
    for (int i = 1; i <= nNew; i++)  
        for (int j = i; (i + j + 2 * i * j) <= nNew; j++)  
            marked[i + j + 2 * i * j] = true;  
}  
  
// Returns number of pairs with fiven conditions.  
static int countPrimePairs(int n)  
{  
    // In general Sieve of Sundaram, produces  
    // primes smaller than (2*x + 2) for a number  
    // given number x. Since we want primes smaller  
    // than n, we reduce n to half  
    int nNew = (n - 2) / 2;  
  
    // This array is used to separate numbers of  
    // the form i+j+2ij from others where  
    // 1 <= i <= j  
    // Initialize all elements as not marked 
    boolean marked[]=new boolean[nNew + 1];  
  
    SieveOfSundaram(marked, nNew); 
    int count = 0, prime_num;  
  
    // Find primes. Primes are of the form  
    // 2*i + 1 such that marked[i] is false.  
    for (int i = 1; i <= nNew; i++)  
    {  
        if (marked[i] == false)  
        {  
            prime_num = 2 * i + 1;  
  
            // For a given prime number p  
            // number of distinct pairs(i, j)  
            // where (i + j) = p are p/2  
            count = count + (prime_num / 2);  
        }  
    }  
    return count;  
}  
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 12;  
    System.out.println("Number of prime pairs: " + 
    countPrimePairs(n));  
}  
} 
  
// This code is contributed by mits 

