

// Java implementation of the approach 
  
import java.io.*; 
  
class GFG { 
  
  
// Function that returns the required moves 
static int countMoves(int n) 
{ 
    int ct = 0; 
    for (int i = 1; i <= n; i++) 
        ct += i * (n - i); 
  
    // Final move 
    ct += n; 
    return ct; 
} 
  
// Driver Program to test above function 
  
  
    public static void main (String[] args) { 
        int n = 3; 
    System.out.println( countMoves(n)); 
    } 
} 
// This code is contributed by anuj_67.. 

