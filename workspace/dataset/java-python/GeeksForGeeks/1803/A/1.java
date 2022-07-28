

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function that return true if A and B 
// have same number of digits 
static boolean sameLength(int A, int B) 
{ 
    while ((A > 0) && (B > 0)) 
    { 
        A = A / 10; 
        B = B / 10; 
    } 
  
    // Both must be 0 now if 
    // they had same lengths 
    if ((A == 0 )&& (B == 0)) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int A = 21, B = 1; 
    if (sameLength(A, B)) 
        System.out.println ("Yes"); 
    else
        System.out.println("No"); 
  
} 
} 
  
// This code is contributed by @tushil.  

