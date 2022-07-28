

// Efficient Java program to find length of 
// the largest subsequence with GCD greater 
// than 1. 
  
class GFG 
{ 
static int MAX = 100001; 
  
// prime[] for storing smallest prime divisor 
// of element count[] for storing the number 
// of times a particular divisor occurs  
// in a subsequence 
static int[] prime = new int[MAX + 1]; 
static int[] countdiv = new int[MAX + 1]; 
  
// Simple sieve to find smallest prime  
// factors of numbers smaller than MAX 
static void SieveOfEratosthenes() 
{ 
    for (int i = 2; i * i <= MAX; ++i) 
    { 
        if (prime[i] == 0) 
            for (int j = i * 2; j <= MAX; j += i) 
                prime[j] = i; 
    } 
  
    // Prime number will have same divisor 
    for (int i = 1; i < MAX; ++i) 
        if (prime[i] == 0) 
            prime[i] = i; 
} 
  
// Returns length of the largest subsequence 
// with GCD more than 1. 
static int largestGCDSubsequence(int arr[], int n) 
{ 
    int ans = 0; 
    for (int i = 0; i < n; ++i) 
    { 
        int element = arr[i]; 
  
        // Fetch total unique prime divisor of element 
        while (element > 1) 
        { 
            int div = prime[element]; 
  
            // Increment count[] of Every unique divisor 
            // we get till now 
            ++countdiv[div]; 
  
            // Find maximum frequency of divisor 
            ans = Math.max(ans, countdiv[div]); 
  
            while (element % div == 0) 
                element /= div; 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    // Pre-compute smallest divisor of all numbers 
    SieveOfEratosthenes(); 
  
    int arr[] = {10, 15, 7, 25, 9, 35}; 
    int size = arr.length; 
  
    System.out.println(largestGCDSubsequence(arr, size)); 
} 
} 
  
// This code is contributed by mits 

