

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{ 
  
static int mod = 1000000007; 
  
    // Function to return a^n % mod 
    static long power(long a, long n)  
    { 
        if (n == 0)  
        { 
            return 1; 
        } 
  
        long p = power(a, n / 2) % mod; 
        p = (p * p) % mod; 
        if (n == 1)  
        { 
            p = (p * a) % mod; 
        } 
        return p; 
    } 
  
    // Compute sum of max(A) - min(A) for all subsets 
    static long computeSum(int[] arr, int n)  
    { 
  
        // Sort the array. 
        Arrays.sort(arr); 
  
        long sum = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // Maxs = 2^i - 1 
            long maxs = (power(2, i) - 1 + mod) % mod; 
            maxs = (maxs * arr[i]) % mod; 
  
            // Mins = 2^(n-1-i) - 1 
            long mins = (power(2, n - 1 - i) - 1 + mod) % mod; 
            mins = (mins * arr[i]) % mod; 
  
            long V = (maxs - mins + mod) % mod; 
            sum = (sum + V) % mod; 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {4, 3, 1}; 
        int n = arr.length; 
        System.out.println(computeSum(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

