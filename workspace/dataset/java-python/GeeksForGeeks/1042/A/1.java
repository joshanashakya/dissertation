

// Java implementation of the above approach  
import java.util.*; 
class GfG  
{  
      
static int N = 100005 ; 
static int MAX = 10000002;  
  
  
  
static int lpd[] = new int[MAX];  
  
// to compute least prime divisor of i  
static void preCompute()  
{  
    lpd[0] = lpd[1] = 1;  
    for (int i = 2; i * i < MAX; i++)  
    {  
        for (int j = i * 2; j < MAX; j += i)  
        {  
            if (lpd[j] == 0)  
            {  
                lpd[j] = i;  
            }  
        }  
    }  
    for (int i = 2; i < MAX; i++) 
    {  
        if (lpd[i] == 0)  
        {  
            lpd[i] = i;  
        }  
    }  
}  
  
// Function that returns the maximum  
// length subsequence such that  
// adjacent elements have a common factor.  
static int maxLengthSubsequence(int arr[], int n)  
{  
    int dp[] = new int[N];  
Map<Integer, Integer> pos = new HashMap<Integer, Integer> ();  
  
    // Initialize dp array with 1.  
    for (int i = 1; i <= n; i++)  
        dp[i] = 1;  
  
    for (int i = 1; i <= n; i++)  
    {  
        while (arr[i] > 1)  
        {  
            int p = lpd[arr[i]];  
            if (pos.containsKey(p)) 
            {  
                // p has appeared at least once.  
                dp[i] = Math.max(dp[i], 1 + dp[pos.get(p)]);  
            }  
              
            // Update latest occurrence of prime p.  
            pos.put(p, i);  
            while (arr[i] % p == 0)  
                arr[i] /= p;  
        }  
    }  
  
    // Take maximum value as the answer.  
    int ans = 1;  
    for (int i = 1; i <= n; i++) 
    {  
        ans = Math.max(ans, dp[i]);  
    }  
  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 13, 2, 8, 6, 3, 1, 9 };  
    int n = arr.length - 1;  
  
    preCompute();  
    System.out.println(maxLengthSubsequence(arr, n));  
} 
}  
  
// This code is contributed by Prerna Saini. 

