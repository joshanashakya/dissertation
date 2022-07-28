

// Java implementation of the approach 
class GFG  
{ 
    static final int V_SUM_MAX = 1000; 
    static final int N_MAX = 100; 
    static final int W_MAX = 10000000; 
      
    // To store the states of DP  
    static int dp[][] = new int[V_SUM_MAX + 1][N_MAX];  
    static boolean v[][] = new boolean [V_SUM_MAX + 1][N_MAX];  
      
    // Function to solve the recurrence relation  
    static int solveDp(int r, int i, int w[],        
                          int val[], int n)  
    {  
        // Base cases  
        if (r <= 0)  
            return 0;  
              
        if (i == n)  
            return W_MAX;  
              
        if (v[r][i])  
            return dp[r][i];  
      
        // Marking state as solved  
        v[r][i] = true;  
      
        // Recurrence relation  
        dp[r][i] = Math.min(solveDp(r, i + 1, w, val, n),  
                     w[i] + solveDp(r - val[i],  
                                    i + 1, w, val, n));  
          
        return dp[r][i];  
    }  
      
    // Function to return the maximum weight  
    static int maxWeight(int w[], int val[],  
                         int n, int c)  
    {  
      
        // Iterating through all possible values  
        // to find the the largest value that can  
        // be represented by the given weights  
        for (int i = V_SUM_MAX; i >= 0; i--) 
        {  
            if (solveDp(i, 0, w, val, n) <= c)  
            {  
                return i;  
            }  
        }  
        return 0;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int w[] = { 3, 4, 5 };  
        int val[] = { 30, 50, 60 };  
        int n = w.length;  
        int C = 8;  
      
        System.out.println(maxWeight(w, val, n, C));  
    }  
} 
  
// This code is contributed by AnkitRai01 

