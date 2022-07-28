

// Java implementation of the above approach  
class GFG 
{ 
  
static int maxn = 16;  
  
// Function to generate the dp array  
static int[] precompute()  
{  
int dp[] = new int[maxn], arr[]={ 4, 6, 9 }; 
  
// initilize 
for(int i = 0; i < maxn; i++)dp[i] = -1; 
  
dp[0] = 0;  
  
for (int i = 1; i < maxn; ++i)  
{  
  
    // combination of three integers  
    for (int k = 0; k < 3; k++)  
    { 
        int j = arr[k]; 
  
        // take the maxium number of summands  
        if (i >= j && dp[i - j] != -1)  
        {  
            dp[i] = Math.max(dp[i], dp[i - j] + 1);  
        }  
    }  
}  
  
return dp;  
}  
  
// Function to find the maximum number of summands  
static int Maximum_Summands(int[] dp, int n)  
{  
// If n is a smaller number, less than 16  
// return dp[n]  
if (n < maxn)  
    return dp[n];  
  
else {  
  
    // Else, find a minimal number t  
    // as explained in solution  
    int t = (n - maxn) / 4 + 1;  
    return t + dp[n - 4 * t];  
}  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int n = 12;  
  
    // Generate dp array  
    int[] dp = precompute();  
  
    System.out.println(Maximum_Summands(dp, n));  
} 
}  
  
// This code is contributed by Arnab Kundu 

