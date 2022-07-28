

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find A, B and C 
static void MinimumValue(int x, int y) 
{ 
  
    // Keep minimum number in x 
    if (x > y) 
    { 
        int temp = x; 
            x = y; 
            y = temp; 
    } 
  
    // Find the numbers 
    int a = 1; 
    int b = x - 1; 
    int c = y - b; 
  
    System.out.print( a + " " + b + " " + c); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int x = 123, y = 13; 
  
    // Function call 
    MinimumValue(x, y); 
} 
} 
  
// This code is contributed by anuj_67.. 

