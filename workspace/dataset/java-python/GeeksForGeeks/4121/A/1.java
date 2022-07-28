

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
// Function that returns true if the string 
// is made up of two alternating characters 
static boolean isTwoAlter(String s) 
{ 
  
    // Check if ith character matches 
    // with the character at index (i + 2) 
    for (int i = 0; i < s.length() - 2; i++) 
    { 
        if (s.charAt(i) != s.charAt(i + 2)) 
        { 
            return false; 
        } 
    } 
  
    // If string consists of a single 
    // character repeating itself 
    if (s.charAt(0) == s.charAt(1)) 
        return false; 
  
    return true; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
        String str = "ABAB"; 
  
    if (isTwoAlter(str)) 
        System.out.print( "Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by anuj_67.. 

