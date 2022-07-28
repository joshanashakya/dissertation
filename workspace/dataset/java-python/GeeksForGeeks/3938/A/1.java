

// Java program to count number of arrays 
// of size n such that every element is 
// in range [1, m] and adjacen are 
// divisible 
import java.util.*; 
  
class GFG  
{ 
static int MAX = 1000; 
  
static int numofArray(int n, int m) 
{ 
    int [][]dp = new int[MAX][MAX]; 
  
    // For storing factors. 
    Vector<Integer> []di = new Vector[MAX]; 
  
    // For storing multiples. 
    Vector<Integer> []mu = new Vector[MAX]; 
  
    for(int i = 0; i < MAX; i++) 
    { 
        for(int j = 0; j < MAX; j++) 
        { 
            dp[i][j] = 0; 
        } 
    } 
    for(int i = 0; i < MAX; i++) 
    { 
        di[i] = new Vector<>(); 
        mu[i] = new Vector<>(); 
    } 
      
    // calculating the factors and multiples 
    // of elements [1...m]. 
    for (int i = 1; i <= m; i++) 
    { 
        for (int j = 2 * i; j <= m; j += i) 
        { 
            di[j].add(i); 
            mu[i].add(j); 
        } 
        di[i].add(i); 
    } 
  
    // Initalising for size 1 array for 
    // each i <= m. 
    for (int i = 1; i <= m; i++) 
        dp[1][i] = 1; 
  
    // Calculating the number of array possible 
    // of size i and starting with j. 
    for (int i = 2; i <= n; i++) 
    { 
        for (int j = 1; j <= m; j++) 
        { 
            dp[i][j] = 0; 
  
            // For all previous possible values. 
            // Adding number of factors. 
            for (Integer x:di[j]) 
                dp[i][j] += dp[i - 1][x]; 
  
            // Adding number of multiple. 
            for (Integer x:mu[j]) 
                dp[i][j] += dp[i - 1][x]; 
        } 
    } 
  
    // Calculating the total count of array 
    // which start from [1...m]. 
    int ans = 0; 
    for (int i = 1; i <= m; i++) 
    { 
        ans += dp[n][i]; 
        di[i].clear(); 
        mu[i].clear(); 
    } 
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 3, m = 3; 
    System.out.println(numofArray(n, m)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

