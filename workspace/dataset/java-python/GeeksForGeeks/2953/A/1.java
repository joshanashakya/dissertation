

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to print the required matrix 
static void printMatrix(int n, int k) 
{ 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++)  
        { 
  
            // Print k for the left 
            // diagonal elements 
            if (i == j) 
                System.out.print(k + " "); 
  
            // Print 0 for the rest 
            else
                System.out.print("0 "); 
        } 
        System.out.print("\n"); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 3, k = 7; 
  
    printMatrix(n, k); 
} 
}  
  
// This code is contributed by Princi Singh 

