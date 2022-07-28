

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    static long mod = 1000000007; 
  
    // Function to return the factorial of a number 
    static int fact(int n) 
    { 
        int res = 1; 
        for (int i = 2; i <= n; i++) 
            res = res * i; 
        return res; 
    } 
  
    // Function to return the value of nCr 
    static int nCr(int n, int r) 
    { 
        return fact(n) / (fact(r) * fact(n - r)); 
    } 
  
    // Function to return a raised to the power n 
    // with complexity O(log(n)) 
    static long powmod(long a, long n) 
    { 
        if (n == 0) 
            return 1; 
        long pt = powmod(a, n / 2); 
        pt = (pt * pt) % mod; 
        if (n % 2 == 1) 
            return (pt * a) % mod; 
        else
            return pt; 
    } 
  
    // Function to return the number of sub-sets 
    // whose median is also present in the set 
    static long CountSubset(int[] arr, int n) 
    { 
  
        // Number of odd length sub-sets 
        long ans = powmod(2, n - 1); 
  
        // Sort the array 
        Arrays.sort(arr); 
        for (int i = 0; i < n; ++i) { 
            int j = i + 1; 
  
            // Checking each element for leftmost middle 
            // element while they are equal 
            while (j < n && arr[j] == arr[i]) { 
  
                // Calculate the number of elements in 
                // right of rightmost middle element 
                int r = n - 1 - j; 
  
                // Calculate the number of elements in 
                // left of leftmost middle element 
                int l = i; 
  
                // Add selected even length subsets 
                // to the answer 
                ans = (ans + nCr(l + r, l)) % mod; 
                j++; 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 3, 2 }; 
        int n = arr.length; 
        System.out.println(CountSubset(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

