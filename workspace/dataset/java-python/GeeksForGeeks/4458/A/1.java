

// Java implementation of above approach 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
  
// Function to find the count of strings 
static int countStrings(String s) 
{ 
    // Variable to store the final result 
    int sum = 1; 
   
    // Loop iterating through string 
    for (int i = 0; i < s.length(); i++) { 
   
        // If '$' is present at the even 
        // position in the string 
        if (i % 2 == 0 && s.charAt(i) == '$') 
   
            //'sum' is multiplied by 21 
            sum *= 21; 
   
        // If '$' is present at the odd 
        // position in the string 
        else if (s.charAt(i) == '$') 
   
            //'sum' is multiplied by 5 
            sum *= 5; 
    } 
   
    return sum; 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    // Let the string 'str' be s$$e$ 
    String str = "s$$e$"; 
   
    // Print result 
    System.out.println(countStrings(str)); 
} 
} 

