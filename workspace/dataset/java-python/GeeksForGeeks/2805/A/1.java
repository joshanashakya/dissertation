

// Java program to find the resultant String  
// after replacing X with Y and removing Z  
class GFG 
{ 
      
    // Function to replace and remove  
    static String replaceRemove(char []s, char X,  
                                   char Y, char Z)  
    {  
      
        // Two pointer start and end points  
        // to beginning and end position in the string  
        int start = 0, end = s.length - 1;  
      
        while (start <= end) 
        {  
      
            // If start is having Z  
            // find X pos in end and  
            // replace Z with another character  
            if (s[start] == Z) 
            {  
      
                // Find location for having  
                // different character  
                // insted of Z  
                while (end >= 0 && s[end] == Z)  
                {  
                    end--;  
                }  
      
                char temp ; 
                  
                // If found swap character  
                // at start and end  
                if (end > start)  
                {  
                    temp = s[start]; 
                    s[start] = s[end]; 
                    s[end] = temp; 
                      
                    if (s[start] == X)  
                        s[start] = Y;  
                    start++;  
                }  
            }  
              
            // Else increment start  
            // Also checkin for X  
            // at start position  
            else 
            {  
                if (s[start] == X)  
                    s[start] = Y;  
                start++;  
            }  
        }  
          
        String new_s = new String(s); 
        while (new_s.length() > 0 &&  
            new_s.charAt(new_s.length() - 1) == Z)  
        {  
            new_s = new_s.substring(0,new_s.length() - 1);  
        }  
        return new_s; 
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
      
        String str = "batman";  
        char X = 'a', Y = 'd', Z = 'b';  
      
        str = replaceRemove(str.toCharArray() , X, Y, Z);  
      
        if (str.length() == 0) 
        {  
            System.out.println(-1);  
        }  
        else
        {  
            System.out.println(str);  
        }  
    }  
} 
  
// This code is contributed by AnkitRai01 

