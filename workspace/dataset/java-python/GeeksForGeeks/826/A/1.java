

// Java implementation to find area of 
// largest Rectangle without hole 
// within a given Rectangle 
import java.util.*; 
  
class GFG{ 
   
// Function to find the maximum area 
// such that it does not contains any hole 
static void maximumArea(int l, int b, 
                 int x, int y) 
{ 
   
    // Area for all the possible 
    // positions of the cut 
    int left, right, above, below; 
   
    left = x * b; 
    right = (l - x - 1) * b; 
    above = l * y; 
    below = (b - y - 1) * l; 
   
    // Find the maximum area 
    // among the above rectangles 
    System.out.print(Math.max(Math.max(left, right), 
                Math.max(above, below))); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int L = 8, B = 8; 
    int X = 0, Y = 0; 
   
    // Function call 
    maximumArea(L, B, X, Y);  
} 
} 
  
// This code is contributed by Rajput-Ji 

