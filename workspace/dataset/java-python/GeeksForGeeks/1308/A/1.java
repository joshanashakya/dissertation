

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function that returns true if 
// str is Topsy Turvy 
static boolean topsyTurvy(char[] str) 
{ 
  
    // For every character of the string 
    for (int i = 0; i < str.length; i++)  
    { 
  
        // If the current digit cannot form a 
        // valid digit when turned upside-down 
        if (str[i] == '2' || str[i] == '4' ||  
            str[i] == '5' || str[i] == '6' ||  
            str[i] == '7' || str[i] == '9') 
        { 
            return false; 
        } 
    } 
    return true; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "1234"; 
  
    if (topsyTurvy(str.toCharArray())) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
}  
  
// This code is contributed by Rajput-Ji 

