

// Java implementation of the approach 
class GFG 
{ 
static int power(int a, int b, int mod) 
{ 
    int aa = 1; 
    while(b > 0) 
    { 
        if(b % 2 == 1) 
        {  
            aa = aa * a; 
            aa %= mod; 
        } 
        a = a * a; 
        a %= mod; 
        b /= 2; 
    } 
    return aa; 
} 
  
// Function to return the prime subset  
// product of the given array 
static int product(int A[], int n) 
{ 
  
    // Create Sieve to check whether a 
    // number is prime or not 
    int N = 100010; 
    int mod = 1000000007; 
    int []prime = new int[N]; 
    for (int j = 0; j < N; j++) 
    { 
        prime[j] = 1; 
    } 
      
    prime[0] = prime[1] = 0; 
    int i = 2; 
    while (i * i < N) 
    { 
        if (prime[i] == 1) 
            for (int j = 2 * i; 
                    j < N;j += i) 
                prime[j] = 0; 
  
        i += 1; 
    } 
  
    // Length of the array 
    // Calculating 2^(n-1) % mod 
    int t = power(2, n - 1, mod - 1); 
  
    int ans = 1; 
  
    for (int j = 0; j < n; j++) 
    { 
        i = A[j]; 
  
        // If element is prime then add 
        // its contribution in the result 
        if( prime[i] == 1) 
        { 
            ans *= power(i, t, mod); 
            ans %= mod; 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int A[] = {3, 7}; 
      
    int n = A.length; 
      
    System.out.printf("%d", product(A, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

