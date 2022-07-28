

// Java implementation of the approach  
class GFG  
{ 
  
    // Function to return the maximum possible  
    // integer that can be obtained from the  
    // given integer after performing  
    // the given operations  
    static String maxInt(char str[])  
    {  
        // For every digit  
        for (int i = 0; i < str.length; i++) 
        {  
      
            // Digits greater than or equal to 5  
            // need not to be changed as changing  
            // them will lead to a smaller number  
            if (str[i] < '5') 
            {  
                str[i] = (char)(('9' - str[i]) + '0');  
            }  
        }  
      
        // The resulting integer  
        // cannot have leading zero  
        if (str[0] == '0')  
            str[0] = '9';  
      
        String str2 = new String(str); 
        return str2;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        String str = "42";  
      
        System.out.println(maxInt(str.toCharArray()));  
    }  
} 
  
// This code is contributed by AnkitRai01 

