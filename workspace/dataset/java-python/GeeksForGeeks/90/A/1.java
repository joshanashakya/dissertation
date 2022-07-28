

// Java program to check if sum of primes from an array  
// is divisible by any of the primes from the same array  
class Solution 
{ 
    //returns the maximum value 
static int max_element(int A[]) 
{ 
    int max=Integer.MIN_VALUE; 
      
    for(int i=0;i<A.length;i++) 
        if(max<A[i]) 
            max=A[i]; 
      
    return max; 
} 
  
  
// Function to print "YES" if sum of primes from an array  
// is divisible by any of the primes from the same array  
static void SumDivPrime(int A[], int n)  
{  
    int max_val = (max_element(A)) + 1;  
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
    // THAN OR EQUAL TO max_val  
    // Create a boolean array "prime[0..n]". A  
    // value in prime[i] will finally be false  
    // if i is Not a prime, else true.  
    boolean prime[]=new boolean[max_val+1];  
      
    //initilize the array 
    for(int i=0;i<=max_val;i++) 
    prime[i]=true; 
  
    // Remaining part of SIEVE  
    prime[0] = false;  
    prime[1] = false;  
    for (int p = 2; p * p <= max_val; p++) {  
  
        // If prime[p] is not changed, then  
        // it is a prime  
        if (prime[p] == true) {  
  
            // Update all multiples of p  
            for (int i = p * 2; i <= max_val; i += p)  
                prime[i] = false;  
        }  
    }  
  
    int sum = 0;  
  
    // Traverse through the array  
    for (int i = 0; i < n; ++i) {  
        if (prime[A[i]])  
            sum += A[i];  
    }  
  
    for (int i = 0; i < n; ++i) {  
        if (prime[A[i]] && sum % A[i] == 0) {  
            System.out.println( "YES");  
            return;  
        }  
    }  
  
    System.out.println("NO");  
}  
  
// Driver program  
public static void main(String args[])  
{  
    int A[] = { 1, 2, 3, 4, 5 };  
    int n = A.length;  
  
    SumDivPrime(A, n);  
} 
}  
//contributed by Arnab Kundu 

