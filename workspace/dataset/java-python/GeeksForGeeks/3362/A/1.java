

// Java program to count the minimal 
// replacements such that adjacent characters 
// are unequal 
class GFG  
{ 
  
    // function to return integer value 
    // of i-th character in the string 
    static int charVal(String s, int i)  
    { 
        if (s.charAt(i) == '0')  
        { 
            return 0; 
        } 
        else if (s.charAt(i) == '1')  
        { 
            return 1; 
        }  
        else 
        { 
            return 2; 
        } 
    } 
  
    // Function to count the number of 
    // minimal replacements 
    static int countMinimalReplacements(String s, int i, 
                            int prev, int dp[][], int n)  
    { 
  
        // If the string has reached the end 
        if (i == n)  
        { 
            return 0; 
        } 
  
        // If the state has been visited previously 
        if (dp[i][prev] != -1)  
        { 
            return dp[i][prev]; 
        } 
  
        // Get the current value of character 
        int val = charVal(s, i); 
        int ans = Integer.MAX_VALUE; 
  
        // If it is equal then change it 
        if (val == prev) 
        { 
            val = 0; 
  
            // All possible changes 
            for (int cur = 0; cur <= 2; cur++)  
            { 
                if (cur == prev)  
                { 
                    continue; 
                } 
  
                // Change done 
                val = 1 + countMinimalReplacements(s, 
                                    i + 1, cur, dp, n); 
  
                ans = Math.min(ans, val); 
            } 
        } else // If same no change 
        { 
            ans = countMinimalReplacements(s, i + 1, 
                                        val, dp, n); 
        } 
  
        return dp[i][val] = ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String s = "201220211"; 
  
        // Length of string 
        int n = s.length(); 
  
        // Create a DP array 
        int dp[][] = new int[n][3]; 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < 3; j++) 
            { 
                dp[i][j] = -1; 
            } 
        } 
  
        // First character 
        int val = charVal(s, 0); 
  
        // Function to find minimal replacements 
        System.out.println(countMinimalReplacements(s, 1, 
                                            val, dp, n)); 
    } 
}  
  
// This code is contributed by PrinciRaj1992 

