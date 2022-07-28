

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
static int RODS = 3; 
static int N = 3; 
static int [][][]dp=new int[N + 1][RODS + 1][RODS + 1]; 
  
// Function to initialize the dp table 
static void initialize() 
{ 
  
    // Initialize with maximum value 
    for (int i = 0; i <= N; i += 1) 
    { 
        for (int j = 1; j <= RODS; j++) 
        { 
            for (int k = 1; k <= RODS; k += 1)  
            { 
                dp[i][j][k] = Integer.MAX_VALUE; 
            } 
        } 
    } 
} 
  
// Function to return the minimum cost 
static int mincost(int idx, int src, int dest,int costs[][]) 
{ 
  
    // Base case 
    if (idx > N) 
        return 0; 
  
    // If problem is already solved, 
    // return the pre-calculated answer 
    if (dp[idx][src][dest] != Integer.MAX_VALUE) 
        return dp[idx][src][dest]; 
  
    // Number of the auxilary disk 
    int rem = 6 - (src + dest); 
  
    // Initialize the minimum cost as Infinity 
    int ans = Integer.MAX_VALUE; 
  
    // Calculationg the cost for first case 
    int case1 = costs[src - 1][dest - 1] 
                + mincost(idx + 1, src, rem, costs) 
                + mincost(idx + 1, rem, dest, costs); 
  
    // Calculating the cost for second case 
    int case2 = costs[src - 1][rem - 1] 
                + mincost(idx + 1, src, dest, costs) 
                + mincost(idx + 1, dest, src, costs) 
                + costs[rem - 1][dest - 1] 
                + mincost(idx + 1, src, dest, costs); 
  
    // Minimum of both the above cases 
    ans = Math.min(case1, case2); 
  
    // Store it in the dp table 
    dp[idx][src][dest] = ans; 
  
    // Return the minimum cost 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
          
    int [][]costs = { { 0, 1, 2 }, 
                            { 2, 0, 1 }, 
                            { 3, 2, 0 } }; 
    initialize(); 
        System.out.print (mincost(1, 1, 3, costs)); 
          
} 
} 
  
// This code is contributed by ajit..23@  

