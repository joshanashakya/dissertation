

// Java implementation of the approach  
import java.lang.Math; 
  
class GfG 
{ 
  
    // Function to return the length  
    // of the required sub-string  
    static int longestSubstring(String s)  
    {  
        int cnt = 1, maxi = 1;  
      
        // Get the length of the string  
        int n = s.length();  
      
        // Iterate in the string  
        for (int i = 1; i < n; i++)  
        {  
      
            // Check for not consecutive  
            if (s.charAt(i) != s.charAt(i-1))  
                cnt++;  
            else 
            {  
      
                // If cnt greater than maxi  
                maxi = Math.max(cnt, maxi);  
      
                // Re-initialize  
                cnt = 1;  
            }  
        }  
      
        // Check after iteration is complete  
        maxi = Math.max(cnt, maxi);  
      
        return maxi;  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
          
        String s = "ccccdeededff"; 
        System.out.println(longestSubstring(s)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

