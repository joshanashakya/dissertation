

// Java implementation of the approach 
  
import java .io.*; 
  
class GFG { 
   
// function for obtaining the value of f(n) mod 4 
static int fnMod(int n) 
{ 
    // Find the remainder of n when divided by 4 
    int rem = n % 4; 
  
    // If n is of the form 4k or 4k+3 
    if (rem == 0 || rem == 3) 
        return 0; 
  
    // If n is of the form 4k+1 or 4k+2 
    else if (rem == 1 || rem == 2) 
        return 1; 
        return 0; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int n = 6; 
    System.out.print( fnMod(n)); 
    } 
} 
//This code is contributed  
// by shs 

