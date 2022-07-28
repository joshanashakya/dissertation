

// Java implementation of the approach 
class gfg 
{ 
      
// Function that returns true is str is valid 
static boolean isValid(String str, int len) 
{ 
  
    // Assuming the string is binary 
    // If any two consecutive  
    // characters are equal 
    // then the string is invalid 
    for (int i = 1; i < len; i++)  
    { 
        if (str.charAt(i) == str.charAt(i - 1)) 
            return false; 
    } 
  
    // If the string is alternating 
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "0110"; 
    int len = str.length(); 
  
    if (isValid(str, len)) 
        System.out.println("Valid"); 
    else
        System.out.println("Invalid"); 
} 
} 
  
// This code is Contributed by Code_Mech 

