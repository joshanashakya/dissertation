

// Java program to print squares  
// of first 'n' natural numbers 
// wothout using *, / and  
import java.io.*; 
  
class GFG  
{ 
static void printSquares(int n) 
{ 
    // Initialize 'square' and  
    // previous value of 'x' 
    int square = 0, prev_x = 0; 
  
    // Calculate and 
    // print squares 
    for (int x = 0; x < n; x++) 
    { 
        // Update value of square  
        // using previous value 
        square = (square + x + prev_x); 
  
        // Print square and update 
        // prev for next iteration 
        System.out.print( square + " "); 
        prev_x = x; 
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
// by akt_mit 

