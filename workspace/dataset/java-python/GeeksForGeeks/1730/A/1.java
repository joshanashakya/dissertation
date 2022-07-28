

// Java Program to find nth 
// Centered octahedral number 
import java.io.*; 
  
class GFG 
{ 
    // Function to find 
    // Centered octahedral number 
    static int centeredOctahedral(int n) 
    { 
          
    // Formula to calculate nth 
    // Centered octahedral number 
    // and return it into main function. 
      
    return (2 * n + 1) *  
           (2 * n * n + 2 * n + 3) / 3; 
    } 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
    int n = 3; 
    System.out.print( centeredOctahedral(n)); 
    System.out.println(); 
    n = 9; 
    System.out.print(centeredOctahedral(n)); 
    } 
} 
  
// This code is contributed by aj_36 

