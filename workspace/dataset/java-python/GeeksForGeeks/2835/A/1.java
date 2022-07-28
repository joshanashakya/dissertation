

// Java program to find the sum of 
// the addition of all possible subsets 
import java.util.*; 
  
class GFG  
{ 
  
static int MAX = 100; 
  
// Recursive function to find the maximum value of 
// the given recurrence 
static int recur(int ind, int cnt, int last, int a[], 
                            int n, int k, int dp[][]) 
{ 
  
    // If we get K elements 
    if (cnt == k) 
        return 0; 
  
    // If we have reached the end 
    // and K elements are not there 
    if (ind == n) 
        return (int) -1e9; 
  
    // If the state has been visited 
    if (dp[ind][cnt] != -1) 
        return dp[ind][cnt]; 
    int ans = 0; 
  
    // Iterate for every element as the 
    // next possible element 
    // and take the element which gives 
    // the maximum answer 
    for (int i = ind; i < n; i++)  
    { 
        // If this element is the first element 
        // in the individual pair in the subsequence 
        // then simply recurrence with the last 
        // element as i-th index 
        if (cnt % 2 == 0) 
            ans = Math.max(ans,recur(i + 1, cnt + 1, i, a, n, k, dp)); 
  
        // If this element is the second element in 
        // the individual pair, the find gcd with 
        // the previous element and add to the answer 
        // and recur for the next element 
        else
            ans = Math.max(ans, __gcd(a[last], a[i]) +  
                recur(i + 1, cnt + 1, 0, a, n, k, dp)); 
    } 
  
    return dp[ind][cnt] = ans; 
} 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a[] = { 4, 5, 3, 7, 8, 10, 9, 8 }; 
    int n = a.length; 
    int k = 4; 
    int [][]dp = new int[n][MAX]; 
    for(int i = 0; i < n; i++) 
    { 
        for(int j = 0; j < MAX; j++) 
        { 
            dp[i][j] = -1; 
        } 
    } 
    System.out.println(recur(0, 0, 0, a, n, k, dp)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

