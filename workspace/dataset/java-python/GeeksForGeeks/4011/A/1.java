

// Java program to print  
// squares of first 'n'  
// natural numbers without  
// using *, / and - 
import java.io.*; 
  
class GFG  
{ 
static void printSquares(int n) 
{ 
    // Initialize 'square'  
    // and first odd number 
    int square = 0, odd = 1; 
  
    // Calculate and 
    // print squares 
    for (int x = 0; x < n; x++) 
    { 
        // Print square 
        System.out.print(square +  
                           " " ); 
  
        // Update 'square' 
        // and 'odd' 
        square = square + odd; 
        odd = odd + 2; 
    } 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 5; 
    printSquares(n); 
} 
} 
  
// This code is contributed 
// by ajit 

