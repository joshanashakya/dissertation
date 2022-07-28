

// Java implementation of the above approach 
import java.util.Arrays; 
  
class GFG 
{ 
      
// Function to store the primes 
static void sieve(int maxEle, int prime[]) 
{ 
    prime[0] = prime[1] = 1; 
  
    for (int i = 2; i * i <= maxEle; i++)  
    { 
        if (prime[i]==0) 
        { 
            for (int j = 2 * i; j <= maxEle; j += i) 
                prime[j] = 1; 
        } 
    } 
} 
  
// Function to return the sum of digits 
static int digitSum(int n) 
{ 
    int sum = 0; 
    while (n > 0)  
    { 
        sum += n % 10; 
        n = n / 10; 
    } 
    return sum; 
} 
  
// Function to print additive primes 
static void printAdditivePrime(int arr[], int n) 
{ 
  
    int maxEle = Arrays.stream(arr).max().getAsInt(); 
  
    int prime[] = new int[maxEle + 1]; 
    sieve(maxEle, prime); 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // If the number is prime 
        if (prime[arr[i]] == 0)  
        { 
            int sum = digitSum(arr[i]); 
  
            // Check if it's digit sum is prime 
            if (prime[sum] == 0) 
                System.out.print(arr[i]+" "); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int a[] = { 2, 4, 6, 11, 12, 18, 7 }; 
    int n =a.length; 
    printAdditivePrime(a, n); 
} 
} 
  
// This code is contributed by chandan_jnu 

