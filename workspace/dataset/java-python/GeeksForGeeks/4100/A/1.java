

// Java implementation of the above approach 
  
import java.io.*; 
  
class GFG { 
      
  
  
// Function to print N groups of equal sum 
static void printGroups(int n) 
{ 
    int x = 1; 
    int y = n * n; 
  
    // No. of Groups 
    for (int i = 1; i <= n; i++) { 
  
        // n/2 pairs 
        for (int j = 1; j <= n / 2; j++) { 
            System.out.print("{ " + x + ", " + y + "} "); 
            x++; 
            y--; 
        } 
  
        System.out.println(); 
    } 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int n = 4; 
    printGroups(n); 
    } 
} 
// This code is contributed by shs 

