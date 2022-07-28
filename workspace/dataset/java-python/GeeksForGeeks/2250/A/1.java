

// Java implementation of above approach 
class GFG 
{ 
    // Count the ways to sum up with odd 
    // by choosing one element form each 
    // pair 
    static int CountOfOddSum(int a[][], int n) 
    { 
        int [][]dp = new int[n][2]; 
        int [][]cnt = new int[n][2]; 
      
        for (int i = 0; i < n; i++)  
        { 
            for (int j = 0; j < 2; j++)  
            { 
      
                // if element is even 
                if (a[i][j] % 2 == 0)  
                { 
      
                    // store count of even 
                    // number in i'th pair 
                    cnt[i][0]++; 
                } 
      
                // if the element is odd 
                else
                { 
      
                    // store count of odd 
                    // number in i'th pair 
                    cnt[i][1]++; 
                } 
            } 
        } 
      
        // Initial state of dp array 
        dp[0][0] = cnt[0][0]; 
        dp[0][1] = cnt[0][1]; 
      
        for (int i = 1; i < n; i++)  
        { 
      
            // dp[i][0] = total number of ways 
            // to get even sum upto i'th pair 
            dp[i][0] = (dp[i - 1][0] * cnt[i][0] +  
                        dp[i - 1][1] * cnt[i][1]); 
      
            // dp[i][1] = total number of ways 
            // to odd even sum upto i'th pair 
            dp[i][1] = (dp[i - 1][0] * cnt[i][1] + 
                        dp[i - 1][1] * cnt[i][0]); 
        } 
      
        // dp[n - 1][1] = total number of ways 
        // to get odd sum upto n'th pair 
        return dp[n - 1][1]; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int a[][] = {{ 1, 2 }, { 3, 6 }}; 
        int n = a.length; 
      
        int ans = CountOfOddSum(a, n); 
      
        System.out.println(ans); 
    } 
} 
  
// This code is contributed by ihritik 

