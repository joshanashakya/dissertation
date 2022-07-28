

// Java implementation of the 
// above approach 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
// Function to print N lines 
static void printLines(int n, int k) 
{ 
    // Iterate N times to print N lines 
    for (int i = 0; i < n; i++) { 
        System.out.println ( k * (6 * i + 1) + " "
            + k * (6 * i + 2) + " "
            + k * (6 * i + 3) + " "
            + k * (6 * i + 5) ); 
    } 
} 
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 2, k = 2; 
    printLines(n, k); 
} 
} 

