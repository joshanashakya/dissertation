

// Java implementation of the above approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
    static long mod = 1000000007; 
    static long[][] arr = new long[1001][1001]; 
  
    // Function to store pascal triangle in 2-d array  
    static void Preprocess()  
    { 
        arr[0][0] = 1; 
        for (int i = 1; i <= 1000; ++i) 
        { 
            arr[i][0] = 1; 
            for (int j = 1; j < i; ++j)  
            { 
                arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % mod; 
            } 
            arr[i][i] = 1; 
        } 
    } 
  
    // Function to return a raised to the power n  
    // with complexity O(log(n))  
    static long powmod(long a, long n)  
    { 
        if (n == 0) 
        { 
            return 1; 
        } 
        long pt = powmod(a, n / 2); 
        pt = (pt * pt) % mod; 
        if (n % 2 == 1)  
        { 
            return (pt * a) % mod; 
        }  
        else
        { 
            return pt; 
        } 
    } 
  
    // Function to return the number of sub-sets  
    // whose median is also present in the set  
    static long CountSubset(int[] val, int n) 
    { 
  
        // Number of odd length sub-sets  
        long ans = powmod(2, n - 1); 
  
        // Sort the array  
        Arrays.sort(val); 
        for (int i = 0; i < n; ++i)  
        { 
            int j = i + 1; 
  
            // Checking each element for leftmost middle  
            // element while they are equal  
            while (j < n && val[j] == val[i]) 
            { 
  
                // Calculate the number of elements in  
                // right of rightmost middle element  
                int r = n - 1 - j; 
  
                // Calculate the number of elements in  
                // left of leftmost middle element  
                int l = i; 
  
                // Add selected even length subsets  
                // to the answer  
                ans = (ans + arr[l + r][l]) % mod; 
                j++; 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        Preprocess(); 
        int val[] = {2, 3, 2}; 
        int n = val.length; 
  
        System.out.println(CountSubset(val, n)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

