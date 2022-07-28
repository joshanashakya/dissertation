

// Java implementation of th approach  
class GFG  
{ 
  
    static final int N = 100;  
      
    static int dp[][] = new int[N][3];  
    static int v[][] = new int[N][3];  
      
    // Function to return the number of  
    // sub-sequences divisible by 3  
    static int findCnt(String s, int i, int r)  
    {  
        // Base-cases  
        if (i == s.length())  
        {  
            if (r == 0)  
                return 1;  
            else
                return 0;  
        }  
      
        // If the state has been solved  
        // before then return its value  
        if (v[i][r] == 1)  
            return dp[i][r];  
      
        // Marking the state as solved  
        v[i][r] = 1;  
      
        // Recurrence relation  
        dp[i][r] = findCnt(s, i + 1, (r * 2 + (s.charAt(i) - '0')) % 3)  
                    + findCnt(s, i + 1, r);  
      
        return dp[i][r];  
    } 
      
    // Driver code  
    public static void main (String[] args)  
    { 
        String s = "11";  
      
        System.out.print(findCnt(s, 0, 0) - 1);  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

