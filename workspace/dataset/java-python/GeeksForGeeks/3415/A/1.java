

class GFG{ 
   
static int [][]dp = new int[1001][1001]; 
   
// Function to return the maximum sum 
// divisible by k from elements of v 
static int find_max(int i, int sum, int []v, int k) 
{ 
   
    if (i == v.length) 
        return 0; 
   
    if (dp[i][sum] != -1) 
        return dp[i][sum]; 
   
    int ans = 0; 
  
    // check if sum of elements excluding the 
    // current one is divisible by k 
    if ((sum + find_max(i + 1, sum, v, k)) % k == 0) 
        ans = find_max(i + 1, sum, v, k); 
       
    // check if sum of elements including the 
    // current one is divisible by k 
    if((sum + v[i] + find_max(i + 1,(sum + v[i]) % k, 
                                   v, k)) % k == 0) 
        // Store the maximum 
        ans = Math.max(ans, v[i] + find_max(i + 1, 
                            (sum + v[i]) % k, v, k)); 
       
    return dp[i][sum] = ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int []arr = { 43, 1, 17, 26, 15 }; 
    int k = 16; 
    for (int i = 0; i < 1001; i++) 
        for (int j = 0; j < 1001; j++) 
            dp[i][j] = -1; 
    System.out.print(find_max(0, 0, arr, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

