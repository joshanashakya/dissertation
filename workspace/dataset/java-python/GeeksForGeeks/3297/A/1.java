

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the count  
    // of the required substrings  
    static int countSubStr(String str, int len)  
    {  
        // To store the final answer  
        int ans = 0;  
      
        // Loop to find the answer  
        for (int i = 0; i < len; i++)  
        {  
      
            // Condition to update the answer  
            if (str.charAt(i) == '0')  
                ans += (i + 1);  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String str = "10010";  
        int len = str.length();  
      
        System.out.println(countSubStr(str, len));  
    }  
} 
  
// This code is contributed by AnkitRai01 

