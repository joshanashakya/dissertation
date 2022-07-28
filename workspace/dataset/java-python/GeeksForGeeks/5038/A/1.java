

// Java implementation of the approach  
class GFG  
{ 
    static final int INT_MAX = Integer.MAX_VALUE; 
      
    // Function to return the length of the  
    // smallest substring divisible by 2^k  
    static int findLength(String s, int k)  
    {  
        // To store the final answer  
        int ans = INT_MAX;  
      
        // Left pointer  
        int l = 0;  
      
        // Right pointer  
        int r = 0;  
      
        // Count of the number of zeros and  
        // ones in the current substring  
        int cnt_zero = 0, cnt_one = 0;  
      
        // Loop for two pointers  
        while (l < s.length() && r <= s.length()) 
        {  
      
            // Condition satisfied  
            if (cnt_zero >= k && cnt_one >= 1) 
            {  
      
                // Updated the answer  
                ans = Math.min(ans, r - l);  
      
                // Update the pointer and count  
                l++;  
                if (s.charAt(l - 1) == '0')  
                    cnt_zero--;  
                else
                    cnt_one--;  
            }  
            else
            {  
      
                // Update the pointer and count  
                if (r == s.length())  
                    break;  
                if (s.charAt(r) == '0')  
                    cnt_zero++;  
                else
                    cnt_one++;  
                r++;  
            }  
        }  
        if (ans == INT_MAX)  
            return -1;  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        String s = "100";  
        int k = 2;  
      
        System.out.println(findLength(s, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

