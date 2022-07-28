

// Java program to find the number  
// of subsequences with gcd 1  
class GFG 
{ 
      
static final int MAX = 1000;  
static int gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return gcd(b % a, a);  
}  
  
// Recursive function to calculate the number  
// of subsequences with gcd 1 starting with  
// particular index  
static int func(int ind, int g, int dp[][], 
                int n, int a[])  
{  
  
    // Base case  
    if (ind == n)  
    {  
        if (g == 1)  
            return 1;  
        else
            return 0;  
    }  
  
    // If already visited  
    if (dp[ind][g] != -1)  
        return dp[ind][g];  
  
    // Either we take or we do not  
    int ans = func(ind + 1, g, dp, n, a)  
            + func(ind + 1, gcd(a[ind], g), dp, n, a);  
  
    // Return the answer  
    return dp[ind][g] = ans;  
}  
  
// Function to return the 
// number of subsequences  
static int countSubsequences(int a[], int n)  
{  
  
    // Hash table to memoize  
    int dp[][] = new int[n][MAX];  
    for(int i = 0; i < n; i++) 
        for(int j = 0; j < MAX; j++) 
            dp[i][j] = -1; 
  
    // Count the number of subsequences  
    int count = 0;  
  
    // Count for every subsequence  
    for (int i = 0; i < n; i++)  
        count += func(i + 1, a[i], dp, n, a);  
  
    return count;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    int a[] = { 3, 4, 8, 16 };  
    int n = a.length;  
    System.out.println(countSubsequences(a, n));  
} 
}  
  
// This code is contributed by Arnab Kundu 

