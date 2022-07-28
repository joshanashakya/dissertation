

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to print the expansion of the string 
static void printExpansion(String str) 
{ 
    String suff = ""; 
    for (int i = str.length() - 1; i >= 0; i--) { 
  
        // Take sub-string from i to n-1 
        suff = suff + str.charAt(i); 
  
        // Print the sub-string 
        System.out.print(suff); 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String str = "geeks"; 
    printExpansion(str); 
  
} 
} 

