

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function to print the moves 
static void twistedTOH(int n, char first, 
                char middle, char last) 
{ 
    // Base case 
    if (n == 1) 
    { 
  
        System.out.println("Move disk " + n + " from rod " + 
                                   first + " to " + middle +  
                                    " and then to " + last); 
  
        return; 
    } 
  
    // Move n-1 disks from first to last 
    twistedTOH(n - 1, first, middle, last); 
  
    // Move largest disk from first to middle 
    System.out.println("Move disk " + n +  
                       " from rod " + first +  
                       " to " + middle); 
  
    // Move n-1 disks from last to first 
    twistedTOH(n - 1, last, middle, first); 
  
    // Move nth disk from middle to last 
    System.out.println("Move disk " + n +  
                       " from rod " + middle +  
                       " to " + last); 
  
    // Move n-1 disks from first to last 
    twistedTOH(n - 1, first, middle, last); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // Number of disks 
    int n = 2; 
  
    // Rods are in order 
    // first(A), middle(B), last(C) 
    twistedTOH(n, 'A', 'B', 'C'); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

