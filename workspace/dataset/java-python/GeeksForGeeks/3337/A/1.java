

// Java program to find minimum cost to make 
// two numeric strings identical 
  
import java.io.*; 
  
class GFG { 
   
  
// Function to find weight of LCS 
 static int lcs(int dp[][], String a, String b, 
        int m, int n) 
{ 
    for (int i = 0; i < 100; i++) 
        for (int j = 0; j < 100; j++) 
            dp[i][j] = -1; 
  
    if (m < 0 || n < 0) { 
        return 0; 
    } 
  
    // if this state is already 
    // calculated then return 
    if (dp[m][n] != -1) 
        return dp[m][n]; 
  
    int ans = 0; 
    if (a.charAt(m) == b.charAt(n)) { 
        // adding required weight for 
        // particular match 
        ans = (a.charAt(m) - 48) + lcs(dp, a, b, 
                                m - 1, n - 1); 
    } 
    else
        // recurse for left and right child 
        // and store the max 
        ans = Math.max(lcs(dp, a, b, m - 1, n), 
                lcs(dp, a, b, m, n - 1)); 
  
    dp[m][n] = ans; 
    return ans; 
} 
  
// Function to calculate cost of string 
 static int costOfString(String str) 
{ 
    int cost = 0; 
  
    for (int i = 0; i < str.length(); i++) 
        cost += (str.charAt(i) - 48); 
  
    return cost; 
} 
  
// Driver code 
    public static void main (String[] args) { 
            String a, b; 
  
    a = "9142"; 
    b = "1429"; 
  
    int dp[][] = new int[101][101]; 
  
    // Minimum cost needed to make two strings identical 
    System.out.print( (costOfString(a) + costOfString(b) -  
                    2 * lcs(dp, a, b, a.length() - 1,  
                                    b.length() - 1))); 
  
    } 
} 
// This code is contributed by anuj_67. 

