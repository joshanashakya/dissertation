

// Java implementation of the approach 
import java.util.*; 
  
class GFG{ 
  
static int N = 100005; 
static int mod = 1000000007; 
static int temp = 391657242; 
  
// To store the factorial and the 
// factorial mod inverse of a number 
static int []factorial = new int[N]; 
static int []modinverse = new int[N]; 
  
// Function to find (a ^ m1) % mod 
static int power(int a, int m1) 
{ 
    if (m1 == 0) 
        return 1; 
    else if (m1 == 1) 
        return a; 
    else if (m1 == 2) 
        return (a * a) % mod; 
    else if ((m1 & 1)!=0) 
        return (a * power(power(a, m1 / 2), 2)) % mod; 
    else
        return power(power(a, m1 / 2), 2) % mod; 
} 
  
// Function to find factorial 
// of all the numbers 
static void factorialfun() 
{ 
    factorial[0] = 1; 
    for (int i = 1; i < N; i++) 
        factorial[i] = (factorial[i - 1] * i)% mod; 
} 
  
// Function to find the factorial 
// mod inverse of all the numbers 
static void modinversefun() 
{ 
    modinverse[N - 1] = power(factorial[N - 1], mod - 2) % mod; 
  
    for (int i = N - 2; i >= 0; i--) 
        modinverse[i] = (modinverse[i + 1]*(i + 1))%mod; 
} 
  
// Function to return nCr 
static int binomial(int n, int r) 
{ 
    if (r > n) 
        return 0; 
  
    int a = (factorial[n] * modinverse[n - r]) % mod; 
  
    a = (a * modinverse[r]) % mod; 
    return a; 
} 
  
// Function to find sum of f(s) for all 
// the chosen sets from the given array 
static int max_min(int a[], int n, int k) 
{ 
    // Sort the given array 
    Arrays.sort(a); 
  
    // Calculate the factorial and 
    // modinverse of all elements 
    factorialfun(); 
    modinversefun(); 
  
    int ans = 0; 
    k--; 
  
    // For all the possible sets 
    // Calculate max(S) and min(S) 
    for (int i = 0; i < n; i++) { 
        int x = n - i - 1; 
        if (x >= k) 
            ans -= binomial(x, k) * a[i] % mod; 
  
        int y = i; 
        if (y >= k) 
            ans += binomial(y, k) * a[i] % mod; 
  
        ans = (ans + mod) % mod; 
    } 
  
    return ans%temp; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int []a = { 1, 1, 3, 4 }; 
    int k = 2; 
    int n = a.length; 
  
    System.out.println(max_min(a, n, k)); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

