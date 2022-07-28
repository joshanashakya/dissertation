

// Java function to calculate the number of  
// ways to achieve sum x in n no of throwsVal  
class GFG  
{ 
  
    static int mod = 1000000007; 
    static int[][] dp = new int[55][55]; 
  
    // Function to calculate recursively the  
    // number of ways to get sum in given  
    // throwsVal and [1..m] values  
    static int NoofWays(int face, int throwsVal, int sum) 
    { 
        // Base condition 1  
        if (sum == 0 && throwsVal == 0) 
        { 
            return 1; 
        } 
  
        // Base condition 2  
        if (sum < 0 || throwsVal == 0)  
        { 
            return 0; 
        } 
  
        // If value already calculated dont  
        // move into re-computation  
        if (dp[throwsVal][sum] != -1)  
        { 
            return dp[throwsVal][sum]; 
        } 
  
        int ans = 0; 
        for (int i = 1; i <= face; i++) 
        { 
  
            // Recusively moving for sum-i in  
            // throwsVal-1 no of throwsVal left  
            ans += NoofWays(face, throwsVal - 1, sum - i); 
        } 
  
        // Inserting present values in dp  
        return dp[throwsVal][sum] = ans; 
    } 
  
    // Driver code  
    public static void main(String[] args) 
    { 
        int faces = 6, throwsVal = 3, sum = 12; 
        for (int i = 0; i < 55; i++)  
        { 
            for (int j = 0; j < 55; j++)  
            { 
                dp[i][j] = -1; 
            } 
        } 
  
        System.out.println(NoofWays(faces, throwsVal, sum)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

