

// Java implementation of the above approach. 
class GFG 
{ 
    final static int N = 100 ; 
    final static int INF = 1000000 ; 
      
    // states of DP  
    static int dp[][] = new int[N][N];  
    static int vis[][] = new int[N][N];  
      
    // function to find minimum sum  
    static int findSum(int []arr, int n, 
                       int k, int l, int r)  
    {  
        // base-case  
        if ((l) + (n - 1 - r) == k)  
            return arr[r] - arr[l];  
              
        // if state is solved before, return  
        if (vis[l][r] == 1)  
            return dp[l][r];  
              
        // marking the state as solved  
        vis[l][r] = 1;  
          
        // recurrence relation  
        dp[l][r] = Math.min(findSum(arr, n, k, l, r - 1),  
                            findSum(arr, n, k, l + 1, r));  
                              
        return dp[l][r] ; 
    }  
      
    // Driver function  
    public static void main (String[] args)  
    {  
        // input values  
        int arr[] = { 1, 2, 100, 120, 140 };  
        int k = 2;  
        int n = arr.length;  
      
        // calling the required function;  
        System.out.println(findSum(arr, n, k, 0, n - 1));  
    }  
} 
  
// This code is contributed by AnkitRai01 

