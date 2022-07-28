

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the largest  
    // substring divisible by 2  
    static String largestSubStr(String s)  
    {  
        // While the last character of  
        // the string is '1', pop it  
        while (s.length() != 0 &&  
               s.charAt(s.length() - 1) == '1')  
            s = s.substring(0, s.length() - 1);  
      
        // If the original string had no '0'  
        if (s.length() == 0)  
            return "-1";  
        else
            return s;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        String s = "11001";  
      
        System.out.println(largestSubStr(s));  
    }  
} 
  
// This code is contributed by AnkitRai01 

