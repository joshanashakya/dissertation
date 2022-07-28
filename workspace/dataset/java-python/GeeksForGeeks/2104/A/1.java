

// Java program to find the minimum number 
// of operations required to sum to N 
  
class GFG  
{ 
      
    // Function to return the minimum operations required 
    // to sum to a number reprented by the binary string S 
    static int findMinOperations(String S) 
    { 
          
        // Reverse the string to consider 
        // it from LSB to MSB 
        S = reverse(S); 
        int n = S.length(); 
  
        // initialise the dp table 
        int dp[][] = new int[n + 1][2]; 
  
        // If S[0] = '0', there is no need to 
        // perform any operation 
        if (S.charAt(0) == '0') 
        { 
            dp[0][0] = 0; 
        }  
        else
        { 
            // If S[0] = '1', just perform a single 
            // operation(i.e Add 2^0) 
            dp[0][0] = 1; 
        } 
  
        // Irrespective of the LSB, dp[0][1] is always 
        // 1 as there is always the need of making the 
        // suffix of the binary string of the form "11....1" 
        // as suggested by the definition of dp[i][1] 
        dp[0][1] = 1; 
  
        for (int i = 1; i < n; i++)  
        { 
            if (S.charAt(i) == '0') 
            { 
                // Transition from dp[i - 1][0] 
                dp[i][0] = dp[i - 1][0]; 
  
                /* 1. Transition from dp[i - 1][1] by just doing 
                1 extra operation of subtracting 2^i 
                2. Transition from dp[i - 1][0] by just doing 
                1 extra operation of subtracting 2^(i+1) */
                dp[i][1] = 1 + Math.min(dp[i - 1][1], dp[i - 1][0]); 
            }  
            else 
            { 
  
                // Transition from dp[i - 1][1] 
                dp[i][1] = dp[i - 1][1]; 
  
                /* 1. Transition from dp[i - 1][1] by just doing  
                1 extra operation of adding 2^(i+1) 
                2. Transition from dp[i - 1][0] by just doing  
                1 extra operation of adding 2^i */
                dp[i][0] = 1 + Math.min(dp[i - 1][0], dp[i - 1][1]); 
            } 
        } 
  
        return dp[n - 1][0]; 
    } 
  
    static String reverse(String input)  
    { 
        char[] temparray = input.toCharArray(); 
        int left, right = 0; 
        right = temparray.length - 1; 
        for (left = 0; left < right; left++, right--) 
        { 
            // Swap values of left and right  
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right] = temp; 
        } 
        return String.valueOf(temparray); 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String S = "100"; 
        System.out.println(findMinOperations(S)); 
        S = "111"; 
        System.out.println(findMinOperations(S)); 
    } 
} 
  
// This code is contributed by  
// PrinciRaj1992  

