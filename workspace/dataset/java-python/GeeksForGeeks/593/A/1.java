

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the minimized number  
    static String minNum(char num[], int k)  
    {  
      
        // Total digits in the number  
        int len = num.length;  
      
        // If the string is empty or there  
        // are no operations to perform  
        if (len == 0 || k == 0)  
        { 
            String num_str = new String(num); 
            return num_str;  
        } 
      
        // "0" is a valid number  
        if (len == 1)  
            return "0";  
      
        // If the first digit is not already 1 then  
        // update it to 1 and decrement k  
        if (num[0] != '1')  
        {  
            num[0] = '1';  
            k--;  
        }  
      
        int i = 1;  
          
        // While there are operations left  
        // and the number can still be updated  
        while (k > 0 && i < len)  
        {  
      
            // If the current digit is not already 0  
            // then update it to 0 and decrement k  
            if (num[i] != '0') 
            {  
                num[i] = '0';  
                k--;  
            }  
            i++;  
        }  
          
        String num_str = new String(num); 
          
        // Return the minimised number  
        return num_str;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        String num = "91945";  
        int k = 3;  
      
        System.out.println(minNum(num.toCharArray(), k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

