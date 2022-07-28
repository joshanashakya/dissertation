

// Java implementation of the above approach 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to find a number 
static void printNumberWithDR(int k, int d) 
{ 
  
    // If d is 0 k has to be 1 
    if (d == 0 && k != 1) 
        System.out.print( "-1"); 
  
    else { 
        System.out.print(d); 
        k--; 
  
        // Print k-1 zeroes 
        while (k-->0) 
            System.out.print( "0"); 
    } 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int k = 4, d = 4; 
  
    printNumberWithDR(k, d); 
    } 
} 
  
  
//This code is contributed by inder_verma.. 

