

// Java program to find the length  
// of the longest increasing sub 
// sequence from the given array  
// such that no two adjacent  
// elements are co prime  
  
class GFG 
{ 
    static int N=100005;  
  
// Function to find the length of the  
// longest increasing sub sequence  
// from the given array such that  
// no two adjacent elements are co prime  
static int LIS(int a[], int n)  
{  
    // To store dp and d value  
    int dp[]=new int[N], d[]=new int[N];  
  
    // To store required answer  
    int ans = 0;  
  
    // For all elements in the array  
    for (int i = 0; i < n; i++)  
    {  
        // Initially answer is one  
        dp[a[i]] = 1;  
  
        // For all it's divisors  
        for (int j = 2; j * j <= a[i]; j++)  
        {  
            if (a[i] % j == 0)  
            {  
                // Update the dp value  
                dp[a[i]] = Math.max(dp[a[i]], dp[d[j]] + 1);  
                dp[a[i]] = Math.max(dp[a[i]], dp[d[a[i] / j]] + 1);  
  
                // Update the divisor value  
                d[j] = a[i];  
                d[a[i] / j] = a[i];  
            }  
        }  
  
        // Check for required answer  
        ans = Math.max(ans, dp[a[i]]);  
  
        // Update divisor of a[i]  
        d[a[i]] = a[i];  
    }  
  
    // Return reqired answer  
    return ans;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int a[] = { 1, 2, 3, 4, 5, 6 };  
  
    int n = a.length;  
  
    System.out.print( LIS(a, n));  
} 
}  
  
// This code is contributed by Arnab Kundu 

