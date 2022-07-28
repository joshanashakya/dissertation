

// Java implementation of the approach 
  
class GFG  
{ 
      
    // Function to return the minimum swaps required  
    static int findMinSwaps(String s, int k)  
    {  
        // To store the final answer  
        int ans = 0;  
      
        // To store the count of one and zero  
        int c_one = 0, c_zero = 0;  
      
        // Loop from end of the string  
        for (int i = s.length() - 1; i >= 0; i--) 
        {  
      
            // If s[i] = 1  
            if (s.charAt(i) == '1')  
                c_one++;  
      
            // If s[i] = 0  
            if (s.charAt(i) == '0')  
            { 
                c_zero++; 
                ans += c_one;  
            } 
      
            // If c_zero = k  
            if (c_zero == k)  
                break;  
        }  
      
        // If the result can't  
        // be achieved  
        if (c_zero < k)  
            return -1;  
      
        // Return the final answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String s = "100111";  
        int k = 2;  
      
        System.out.println(findMinSwaps(s, k));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

