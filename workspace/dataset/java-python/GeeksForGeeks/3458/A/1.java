

// Java implementation of the approach 
  
// Function to return the minimum possible 
// integer that can be obtained from the 
// given integer after performing 
// the given operations 
  
import java.util.*; 
  
class GFG{ 
  
static String minInt(String str) 
{ 
    // For every digit 
    String s = ""; 
    for (int i = 0; i < str.length(); i++) 
    { 
  
        // Digits less than 5 need not to be 
        // changed as changing them will 
        // lead to a larger number 
        if (str.charAt(i) >= '5')  
        { 
            s += (char)(('9' - str.charAt(i)) + '0'); 
        } 
        else
        { 
            s += str.charAt(i); 
        } 
          
    } 
  
    // The resulting integer 
    // cannot have leading zero 
    if (str.charAt(0) == '0') 
        s += '9'; 
  
    return s; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String str = "589"; 
  
    System.out.println(minInt(str)); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

