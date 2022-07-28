

/* Java Program to find if Array can have a sum 
of K by applying three types of possible  
operations on it */
class GFG  
{ 
  
    static int MAX = 100; 
  
    // Check if it is possible to achieve a sum with 
    // three operation allowed. 
    static int check(int i, int sum, int n,  
                    int k, int a[], int dp[][]) 
    { 
        // If sum is negative. 
        if (sum <= 0)  
        { 
            return 0; 
        } 
  
        // If going out of bound. 
        if (i >= n) 
        { 
            // If sum is achieved. 
            if (sum == k) 
            { 
                return 1; 
            } 
  
            return 0; 
        } 
  
        // If the current state is not evaluated yet. 
        if (dp[i][sum] != -1) 
        { 
            return dp[i][sum]; 
        } 
  
        // Replacing element with negative value of 
        // the element. 
        dp[i][sum] = check(i + 1, sum - 2 * a[i], n, k, a, dp) | 
                                check(i + 1, sum, n, k, a, dp); 
  
        // Substracting index number from the element. 
        dp[i][sum] = check(i + 1, sum - (i + 1), n, 
                k, a, dp) | dp[i][sum]; 
  
        // Adding index number to the element. 
        dp[i][sum] = check(i + 1, sum + i + 1, n, 
                k, a, dp) | dp[i][sum]; 
  
        return dp[i][sum]; 
    } 
  
    // Wrapper Function 
    static int wrapper(int n, int k, int a[]) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
            sum += a[i]; 
        } 
  
        int[][] dp = new int[MAX][MAX]; 
        for (int i = 0; i < MAX; i++)  
        { 
            for (int j = 0; j < MAX; j++)  
            { 
                dp[i][j] = -1; 
            } 
        } 
  
        return check(0, sum, n, k, a, dp); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int a[] = {1, 2, 3, 4}; 
        int n = 4, k = 5; 
        if (wrapper(n, k, a) == 1) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by Princi Singh 

